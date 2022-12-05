package com.example.csvCompare.model;

import javax.annotation.Nonnull;

@Nonnull
public class Content {
    
	private String currentVersion;
	
	private String previousVersion;
	
	public Content() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Content(String currentVersion, String previousVersion) {
		super();
		this.currentVersion = currentVersion;
		this.previousVersion = previousVersion;
	}
	
	public String getCurrentVersion() {
		return currentVersion;
	}
	
	public void setCurrentVersion(String currentVersion) {
		this.currentVersion = currentVersion;
	}
	
	public String getPreviousVersion() {
		return previousVersion;
	}
	
	public void setPreviousVersion(String previousVersion) {
		this.previousVersion = previousVersion;
	}
	
	@Override
	public String toString() {
		return "Content [currentVersion=" + currentVersion + ", previousVersion=" + previousVersion + "]";
	}
}
