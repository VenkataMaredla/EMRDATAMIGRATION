package com.example.csvCompare.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

@JsonInclude(JsonInclude.Include.NON_NULL) 	//  ignore all null fields
public class DataObject{
    @JsonProperty("resourceType") 
    public String getResourceType() { 
		 return this.resourceType; } 
    public void setResourceType(String resourceType) { 
		 this.resourceType = resourceType; } 
    String resourceType;

	
	 @JsonProperty("metadata") 
	 public Object getMetadata() {
			return metadata;
		}
		public void setMetadata(Object metadata) {
			this.metadata = metadata;
		}  
	   
		Object metadata;
}

