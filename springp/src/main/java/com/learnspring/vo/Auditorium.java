package com.learnspring.vo;

public class Auditorium {

	private int auditoriumId;
	private String auditoriumName;
	private int auditoriumSeats;
	private int auditoriumVipSeats;

	public int getAuditoriumId() {
		return auditoriumId;
	}

	public void setAuditoriumId(int auditoriumId) {
		this.auditoriumId = auditoriumId;
	}

	public String getAuditoriumName() {
		return auditoriumName;
	}

	public void setAuditoriumName(String auditoriumName) {
		this.auditoriumName = auditoriumName;
	}

	public int getAuditoriumSeats() {
		return auditoriumSeats;
	}

	public void setAuditoriumSeats(int auditoriumSeats) {
		this.auditoriumSeats = auditoriumSeats;
	}

	public int getAuditoriumVipSeats() {
		return auditoriumVipSeats;
	}

	public void setAuditoriumVipSeats(int auditoriumVipSeats) {
		this.auditoriumVipSeats = auditoriumVipSeats;
	}

}
