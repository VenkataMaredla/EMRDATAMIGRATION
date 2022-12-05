package com.example.csvCompare.service;

import java.io.File;
import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.json.simple.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.csvCompare.controller.CsvDataController;
import com.example.csvCompare.model.CitEventPhase;
import com.example.csvCompare.model.CsvData;
import com.example.csvCompare.model.DataCollection;
import com.example.csvCompare.model.DataCollectionList;
import com.example.csvCompare.model.DataObject;
import com.example.csvCompare.model.HisPatient;
import com.example.csvCompare.model.MetaDataEMR;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@Service
public class CsvDataServiceImpl implements CsvDataService{
	
	private Logger log = LoggerFactory.getLogger(CsvDataController.class);


	public DataCollectionList getDifference(CsvData csvdata) {
		String currentVersion = "";
		String previousVersion = "";
		String newstr11="";
		String str = "";
		List<String> differenceList= null;
		List<CitEventPhase> phaseList = null;
		List<HisPatient> hisPatientList = null;
		DataCollectionList dataCollectionList = new DataCollectionList();


		try
		{
			if(csvdata!=null && csvdata.getContent() != null) {
				if( csvdata.getContent().getCurrentVersion()!=null) {			
				//fetching currentandprevious version content
				 currentVersion = csvdata.getContent().getCurrentVersion();	
				}
				if(csvdata.getContent().getPreviousVersion()!=null) {
					//fetching currentandprevious version content
					 previousVersion = csvdata.getContent().getPreviousVersion();
				}
			}
			
			//converting currentandprevious version string to jsonArray
			JSONArray currentJson = csvContentToJson(currentVersion);
			JSONArray previousJson = csvContentToJson(previousVersion);
			System.out.println("currentJson: " + currentJson);
			log.info("previousJson: " + previousJson);
			//find the difference between two files
			differenceList = findDifference(currentJson, previousJson);
			log.info("differenceList: " + differenceList);
			//converted to validJson
			newstr11 = formatJson(differenceList);
			System.out.println("newstr11: " + newstr11);
			///move method to one class
			
			ObjectMapper mapper = new ObjectMapper();
			Gson gson = new Gson();

			ArrayList<DataCollection> dataCollections = new ArrayList<>();
			DataCollection dataCollection = new DataCollection();
			ArrayList<DataObject> dataObjList = new ArrayList<>();
			DataObject dataObject = new DataObject();
			
			String resourceType = csvdata.getMetadata().substring(0, csvdata.getMetadata().length()-4).replace("_", "").toLowerCase();
			MetaDataEMR metaDataEMR = new MetaDataEMR();
			LocalDateTime now = LocalDateTime.now();  
			System.out.println(now.toString());  
			metaDataEMR.setCreation_date_time(now.toString());
			metaDataEMR.setCustom_resource_type(resourceType);
			metaDataEMR.setEmr_name("Hypersoft_EMR");
			metaDataEMR.setRaw_data_json(currentJson.toString());
			metaDataEMR.setUpload_id("NULL");
			metaDataEMR.setFailure_id("NULL");
			dataObject.setMetadata(metaDataEMR);
			dataObject.setResourceType("emrrawdata");
			
			System.out.println("dataObject: "+mapper.writeValueAsString(dataObject));
			dataObjList.add(dataObject);
			
			if ("his_patient.csv".equalsIgnoreCase(csvdata.getMetadata())) {
				System.out.println("testHis_Patient");
				//Type collectionType1 = new TypeToken<List<HisPatient>>() {}.getType();				
				List<HisPatient> hisPatientLists = mapper.readValue(newstr11, new TypeReference<List<HisPatient>>(){});
				//hisPatientList = gson.fromJson(newstr11, collectionType1);
				System.out.println("hisPatientList:" + hisPatientLists);
				// mapping to datacollection obj				

				if (hisPatientLists != null) {
					for (HisPatient patient : hisPatientLists) {
						DataObject dataObject1 = new DataObject();
						dataObject1.setMetadata(patient);
						dataObject1.setResourceType(resourceType);
						dataObjList.add(dataObject1);

					}

				}
			}else if (csvdata.getMetadata().contains("cit_event_phase")) {
				System.out.println("cit");
				Type collectionType1 = new TypeToken<List<CitEventPhase>>() {
				}.getType();
				phaseList = gson.fromJson(newstr11, collectionType1);
				System.out.println("phaseList:" + phaseList);			

				if (phaseList != null) {
					for (CitEventPhase phase : phaseList) {
						DataObject dataObject1 = new DataObject();
						dataObject1.setMetadata(phase);
						dataObject1.setResourceType(resourceType);
						dataObjList.add(dataObject1);

					}

				}
			}
				dataCollection.setDataObject(dataObjList);
				dataCollections.add(dataCollection);
				dataCollectionList.setDataCollection(dataCollections);

				System.out.println("dataCollectionList: " + mapper.writeValueAsString(dataCollectionList));

				str = mapper.writeValueAsString(dataCollectionList);
				System.out.println("str: " + str);
			
					
			
			//convert string to JsonArray and created a string which gets stored in csv with semicolon format
			/*org.json.JSONArray jsonArray = new org.json.JSONArray(newstr11);
			System.out.println("jsonArray: " + jsonArray);	

			String csv = CDL.toString(jsonArray);
			System.out.println("Data has been Sucessfully Writeen");
			System.out.println(csv);
			String newCsv = csv.replace(",", ";");
			System.out.println(newCsv);*/
				String path = new File(csvdata.getMetadata()).getAbsolutePath();
				String zipSourceFileName = path.substring(0, path.length()-4)+".zip";
				String jsonSourceFileName = csvdata.getMetadata().substring(0,csvdata.getMetadata().length()-3)+"json";
						
				//sourceFileName = path;
				//System.out.println("csvdata.getMetadata(): "+csvdata.getMetadata().substring(0,csvdata.getMetadata().length()-3)+"json");
				//System.out.println("zipSourceFileName: "+zipSourceFileName);
				//System.out.println("jsonSourceFileName: "+jsonSourceFileName);
				/*File convertToFile1 = new File(zipSourceFileName);
				ZipOutputStream out;
				try {
					out = new ZipOutputStream(new FileOutputStream(convertToFile1));

					//ZipEntry e = new ZipEntry(sourceFileName);
					ZipEntry e = new ZipEntry(jsonSourceFileName);
					out.putNextEntry(e);

					byte[] data = str.getBytes();
					System.out.println("byte: "+data.length);
					out.write(data);
					out.closeEntry();

					out.close();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}*/
			
	        //connecting to upload file microservice
	        RestTemplate restTemplate = new RestTemplate();	
	        String url = "http://localhost:9092/file/uploadToCDL";
	       // String url = "https://SpringbootListenerupload.cloud.pcftest.com/file/upload";
			UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url)
					.queryParam("fileName", csvdata.getMetadata());
			System.out.println("uri: "+builder.toUriString());
	        restTemplate.postForObject(builder.toUriString(), str, String.class);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		return dataCollectionList;
		
	}

	private String formatJson(List<String> differenceList) {
		String newstr11;
		String finalStr = "";
		String diffStr = differenceList.toString();			
		System.out.println("diffStr: "+diffStr);			
		String newstr = "";
		newstr11= diffStr.replace("=", "\":\"").replace("{", "{\"").replace(",", "\",\"").replace("}", "\"}").replace("\"}\",\"", "\"},").replace("\" ", "\"").replace(" \"", "\"");
		return newstr11;
	}

	private List<String> findDifference(JSONArray currentJson, JSONArray previousJson) throws JsonProcessingException {
		System.out.println("currentJson : "+currentJson);
		ArrayList<String> list1 = new ArrayList<String>();
		if (currentJson != null) {
			for (int i = 0; i < currentJson.size(); i++) {
				list1.add(currentJson.get(i).toString());
			}
		}
		System.out.println("list1: "+list1);
		
		ArrayList<String> list2 = new ArrayList<String>();
		if (previousJson != null) {
			for (int i = 0; i < previousJson.size(); i++) {
				list2.add(previousJson.get(i).toString());
			}
		}
		
		List<String> difference = new ArrayList<>(list1);
		difference.removeAll(list2);
		
		
		
		System.out.println("difference: "+difference);
		
		log.info("difference: "+difference);
		
	
		
		
		return difference;
	}
	private JSONArray csvContentToJson(String currentVersion) throws JsonProcessingException {
		ObjectMapper mapperObj = new ObjectMapper();
		String jsonResp;
		String cv1[] = currentVersion.split(",");
		String[] cv2 = cv1[0].split(";");		
       
		//System.out.println("cv1: "+Arrays.toString(cv1));
        //System.out.println("cv2: "+Arrays.toString(cv2));
		
        Stream<String> stream= Arrays.stream(cv1); 
        
		List<LinkedHashMap<String, String>> mapList =stream.skip(1) // skip headers
				.map(line -> line.split(";"))				
				.map(data -> {
					LinkedHashMap<String, String> map = new LinkedHashMap<>();
					for (int i = 0; i < data.length; i++) {
						map.put(cv2[i], data[i]);
					}
					return map;
				}).collect(Collectors.toList());
		
		//
		System.out.println("mapList: "+mapList);
		
		List<Map<String, String>> tx = mapList
				 .stream()
				 .map(m -> m.entrySet().stream()
				 .collect(Collectors.toMap(p -> p.getKey().replace("[", "").replace("'", ""), p -> p.getValue().replace("]", "").replace("\"", "").replace("'", ""))))
			 .collect(Collectors.toList());	
		System.out.println("tx: "+tx);
		
		List<Map<String, String>> tx1 = mapList
				 .stream()
				 .map(m -> {
						LinkedHashMap<String, String> map = new LinkedHashMap<>();
						for (Map.Entry<String, String> map1:m.entrySet()) {					
							map.put(map1.getKey().replace("[", "").replace("'", ""), map1.getValue().replace("]", "").replace("\"", "").replace("'", ""));
						}
						return map;
					})
			 .collect(Collectors.toList());	
		
		System.out.println("tx1: "+tx1);		
		

		JSONArray jsonArray = new JSONArray();
		jsonArray.addAll(tx1);
		System.out.println("jsonArray-biki: "+jsonArray.size());
		
		//
		System.out.println("jsonArray: "+jsonArray);
		return jsonArray;
	}
	
	public void getMetaData(String str) {
		
		
	}
	
	

}
