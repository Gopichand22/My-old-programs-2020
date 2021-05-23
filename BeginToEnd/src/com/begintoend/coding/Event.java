package com.begintoend.coding;

public class Event {

	private int id;
	private String name;
	private int monthOfEvent;
	private boolean nationalHoliday;

	public Event(int id, String name, int monthOfEvent, boolean nationalHoliday) {
		this.id = id;
		this.name = name;
		this.monthOfEvent = monthOfEvent;
		this.nationalHoliday = nationalHoliday;
	}

	public Event() {

	}

	public boolean isNationalHoliday() {
		return nationalHoliday;
	}

	public void setNationalHoliday(boolean nationalHoliday) {
		this.nationalHoliday = nationalHoliday;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDateOfEvent() {
		return monthOfEvent;
	}

	public void setDateOfEvent(int dateOfEvent) {
		this.monthOfEvent = dateOfEvent;
	}

}
