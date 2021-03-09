package com.example.listener.event.model;

public abstract class BaseEventModel {

	protected String eventType;

	protected String createdTime;

	public BaseEventModel(String eventType,String date){
		this.eventType=eventType;
		createdTime=date;
	}
	
	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

}
