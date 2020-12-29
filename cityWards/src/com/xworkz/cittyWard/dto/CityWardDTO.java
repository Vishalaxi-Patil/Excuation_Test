package com.xworkz.cittyWard.dto;

import com.xworkz.cittyWard.constans.WardName;

public class CityWardDTO {
	private int wardNo;
	private WardName wardName;
	private String corporateName;
	private int population;
	private String area;
	
	public CityWardDTO() {
		super();
	}

	public CityWardDTO(int wardNo, WardName wardName, String corporateName, int population, String area) {
		super();
		this.wardNo = wardNo;
		this.wardName = wardName;
		this.corporateName = corporateName;
		this.population = population;
		this.area = area;
	}

	public int getWardNo() {
		return wardNo;
	}

	public void setWardNo(int wardNo) {
		this.wardNo = wardNo;
	}

	public WardName getWardName() {
		return wardName;
	}

	public void setWardName(WardName wardName) {
		this.wardName = wardName;
	}

	public String getCorporateName() {
		return corporateName;
	}

	public void setCorporateName(String corporateName) {
		this.corporateName = corporateName;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	
	
	
	
	
	
	

}
