package com.example.csvCompare.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataCollectionList{
    @JsonProperty("dataCollection") 
    public ArrayList<DataCollection> getDataCollection() { 
		 return this.dataCollection; } 
    public void setDataCollection(ArrayList<DataCollection> dataCollection) { 
		 this.dataCollection = dataCollection; } 
    ArrayList<DataCollection> dataCollection;
}

