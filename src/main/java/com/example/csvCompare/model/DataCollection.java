package com.example.csvCompare.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataCollection{
    @JsonProperty("dataObject") 
    public ArrayList<DataObject> getDataObject() { 
		 return this.dataObject; } 
    public void setDataObject(ArrayList<DataObject> dataObject) { 
		 this.dataObject = dataObject; } 
    ArrayList<DataObject> dataObject;
}