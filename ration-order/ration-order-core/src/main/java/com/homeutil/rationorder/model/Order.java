package com.homeutil.rationorder.model;

import java.util.Date;
import java.util.List;

public class Order extends AbstractModel {
	
	private Date creationDate;
	private Date fulfillmentDate;
	private double totalValue;
	private String provider;
	private List<OrderItem> itemList;
	
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Date getFulfillmentDate() {
		return fulfillmentDate;
	}
	public void setFulfillmentDate(Date fulfillmentDate) {
		this.fulfillmentDate = fulfillmentDate;
	}
	public double getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public List<OrderItem> getItemList() {
		return itemList;
	}
	public void setItemList(List<OrderItem> itemList) {
		this.itemList = itemList;
	}

}
