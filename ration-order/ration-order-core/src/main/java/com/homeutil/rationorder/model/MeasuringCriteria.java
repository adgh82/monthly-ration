package com.homeutil.rationorder.model;

import java.util.List;

public class MeasuringCriteria extends AbstractModel {
	
	List<String> units;

	public List<String> getUnits() {
		return units;
	}

	public void setUnits(List<String> units) {
		this.units = units;
	}
}
