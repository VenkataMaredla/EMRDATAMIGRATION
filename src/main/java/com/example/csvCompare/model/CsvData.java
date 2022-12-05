package com.example.csvCompare.model;

public class CsvData {
	
    private String metadata;
	
	private Content content;
	
	public CsvData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CsvData(String metadata, com.example.csvCompare.model.Content content) {
		super();
		this.metadata = metadata;
		this.content = content;
	}
	
	public String getMetadata() {
		return metadata;
	}
	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}
	public Content getContent() {
		return content;
	}
	public void setContent(Content content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "Csvdata [metadata=" + metadata + ", content=" + content + "]";
	}
	

}
