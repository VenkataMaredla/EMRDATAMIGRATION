package com.example.csvCompare.service;

import java.util.List;

import com.example.csvCompare.model.CsvData;
import com.example.csvCompare.model.DataCollectionList;
import com.example.csvCompare.model.CitEventPhase;

public interface CsvDataService {

	DataCollectionList getDifference(CsvData csvdata);
	

}
