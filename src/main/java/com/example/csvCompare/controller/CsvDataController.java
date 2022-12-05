package com.example.csvCompare.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.csvCompare.model.CsvData;
import com.example.csvCompare.model.DataCollectionList;
import com.example.csvCompare.service.CsvDataService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class CsvDataController {
	
	private Logger log = LoggerFactory.getLogger(CsvDataController.class);
	
	@Autowired
	CsvDataService csvDataService;
	
	@PostMapping("/compareFiles")
	public ResponseEntity<DataCollectionList> compareFiles(@RequestBody String requestBodycontent)throws IOException {	
		
		log.info("Request Body content:" + requestBodycontent);	
		
		String str = requestBodycontent.replace("\\\"","\"");
		String str1 = str.replace("\\\\", "\\");
		System.out.println("str: "+str);
		System.out.println("str1: "+str1);
		String result = str1.replaceAll("^\"|\"$", "");
		System.out.println("result: "+result);
		ObjectMapper mapper = new ObjectMapper();
		CsvData csvData = mapper.readValue(result, CsvData.class);
		log.info("csvdata: " + csvData);
		DataCollectionList response = csvDataService.getDifference(csvData);
		return new ResponseEntity<>(response, HttpStatus.OK);
	
		}
	
	
	}

	

