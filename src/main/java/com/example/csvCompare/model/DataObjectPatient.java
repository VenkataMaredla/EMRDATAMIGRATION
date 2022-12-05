package com.example.csvCompare.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataObjectPatient{
    @JsonProperty("resourceType") 
    public String getResourceType() { 
		 return this.resourceType; } 
    public void setResourceType(String resourceType) { 
		 this.resourceType = resourceType; } 
    String resourceType;
    @JsonProperty("metadata") 
    public MetadataPatient getMetadata() { 
		 return this.metadataPatient; } 
    public void setMetadata(MetadataPatient metadataPatient) { 
		 this.metadataPatient = metadataPatient; } 
    MetadataPatient metadataPatient;
}

