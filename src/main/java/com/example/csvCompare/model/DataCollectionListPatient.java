package com.example.csvCompare.model;

import java.util.ArrayList;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataCollectionListPatient{
    @JsonProperty("dataCollection") 
    public ArrayList<DataCollectionPatient> getDataCollection() { 
		 return this.dataCollection; } 
    public void setDataCollection(ArrayList<DataCollectionPatient> dataCollection) { 
		 this.dataCollection = dataCollection; } 
    ArrayList<DataCollectionPatient> dataCollection;
}

