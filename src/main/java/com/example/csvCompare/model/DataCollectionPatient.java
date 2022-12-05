package com.example.csvCompare.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataCollectionPatient{
    @JsonProperty("dataObject") 
    public ArrayList<DataObjectPatient> getDataObject() { 
		 return this.dataObject; } 
    public void setDataObject(ArrayList<DataObjectPatient> dataObject) { 
		 this.dataObject = dataObject; } 
    ArrayList<DataObjectPatient> dataObject;
}