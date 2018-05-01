package com.homeutil.rationorder.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="MeasurementId")
public class MeasuringCriteria extends AbstractModel {
	
	private String key;
	
	private List<String> units;

	public List<String> getUnits() {		
		return units;
	}

	public void setUnits(List<String> units) {
		this.units = units;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
}
