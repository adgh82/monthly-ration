package com.homeutil.rationorder.model;

import java.util.List;

public class InventoryItem extends AbstractModel {
	
	private String category;
	private String subCategory;
	private MeasuringCriteria measuringCriteria;
	private List<String> brands;
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	public MeasuringCriteria getMeasuringCriteria() {
		return measuringCriteria;
	}
	public void setMeasuringCriteria(MeasuringCriteria measuringCriteria) {
		this.measuringCriteria = measuringCriteria;
	}
	public List<String> getBrands() {
		return brands;
	}
	public void setBrands(List<String> brands) {
		this.brands = brands;
	}

}
