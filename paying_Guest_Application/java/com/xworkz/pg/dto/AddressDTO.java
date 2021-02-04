package com.xworkz.pg.dto;

public class AddressDTO {
	
	private String areaName;
	private int pincode;
	private String landMark;
	private String placeName;
	
	public AddressDTO() {
		// TODO Auto-generated constructor stub
	}

	public AddressDTO(String areaName, int pincode, String landMark, String placeName) {
		super();
		this.areaName = areaName;
		this.pincode = pincode;
		this.landMark = landMark;
		this.placeName = placeName;
	}

	@Override
	public String toString() {
		return "AddressDTO [areaName=" + areaName + ", pincode=" + pincode + ", landMark=" + landMark + ", placeName="
				+ placeName + "]";
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	} 
	
	
	


}
