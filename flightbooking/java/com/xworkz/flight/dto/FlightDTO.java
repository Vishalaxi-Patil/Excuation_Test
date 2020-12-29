package com.xworkz.flight.dto;

import com.xworkz.flight.constants.Company;

public class FlightDTO {
	
	private String airplaneCode;
	private String startingPoint;
	private String destination;
	private int totalSeats;
	private boolean domestic;
	private double businessClassPrice;
	private double economyClassPrice;
	private Company company;
	
	
	public FlightDTO() {
		super();
	}


	public FlightDTO(String airplaneCode, String startingPoint, String destination, int totalSeats, boolean domestic,
			double businessClassPrice, double economyClassPrice, Company company) {
		super();
		this.airplaneCode = airplaneCode;
		this.startingPoint = startingPoint;
		this.destination = destination;
		this.totalSeats = totalSeats;
		this.domestic = domestic;
		this.businessClassPrice = businessClassPrice;
		this.economyClassPrice = economyClassPrice;
		this.company = company;
	}


	public String getAirplaneCode() {
		return airplaneCode;
	}


	public void setAirplaneCode(String airplaneCode) {
		this.airplaneCode = airplaneCode;
	}


	public String getStartingPoint() {
		return startingPoint;
	}


	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public int getTotalSeats() {
		return totalSeats;
	}


	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}


	public boolean isDomestic() {
		return domestic;
	}


	public void setDomestic(boolean domestic) {
		this.domestic = domestic;
	}


	public double getBusinessClassPrice() {
		return businessClassPrice;
	}


	public void setBusinessClassPrice(double businessClassPrice) {
		this.businessClassPrice = businessClassPrice;
	}


	public double getEconomyClassPrice() {
		return economyClassPrice;
	}


	public void setEconomyClassPrice(double economyClassPrice) {
		this.economyClassPrice = economyClassPrice;
	}


	public Company getCompany() {
		return company;
	}


	public void setCompany(Company company) {
		this.company = company;
	}
	
	
	

}
