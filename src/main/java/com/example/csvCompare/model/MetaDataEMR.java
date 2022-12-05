package com.example.csvCompare.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MetaDataEMR {
	
	    @JsonProperty("custom_resource_type") 
		public String getCustom_resource_type() {
			return custom_resource_type;
		}
		public void setCustom_resource_type(String custom_resource_type) {
			this.custom_resource_type = custom_resource_type;
		}
		String custom_resource_type;
		@JsonProperty("raw_data_json") 		
	    Object raw_data_json;
	    public Object getRaw_data_json() {
			return raw_data_json;
		}
		public void setRaw_data_json(Object raw_data_json) {
			this.raw_data_json = raw_data_json;
		}
		@JsonProperty("creation_date_time") 
	    public String getCreation_date_time() {
			return creation_date_time;
		}
		public void setCreation_date_time(String creation_date_time) {
			this.creation_date_time = creation_date_time;
		}
	    String creation_date_time;
	    @JsonProperty("upload_id") 
	    public String getUpload_id() {
			return upload_id;
		}
		public void setUpload_id(String upload_id) {
			this.upload_id = upload_id;
		}
	    
	    String upload_id;
		
	    @JsonProperty("failure_id") 
	   
	    public String getFailure_id() {
			return failure_id;
		}
		public void setFailure_id(String failure_id) {
			this.failure_id = failure_id;
		}
	    String failure_id;
	    
	    @JsonProperty("emr_name") 
		
		public String getEmr_name() {
			return emr_name;
		}
		public void setEmr_name(String emr_name) {
			this.emr_name = emr_name;
		}	
	   
	    
	    String emr_name;
		
		
		
	    

}
