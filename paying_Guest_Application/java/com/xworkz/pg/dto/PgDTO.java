package com.xworkz.pg.dto;

import com.xworkz.pg.dto.AddressDTO;

public class PgDTO {

	private String name;
	private String location;
	private int rentPrice;
	private AddressDTO addressDTO;
	private double openTime;
	private double closeTime;
	private boolean hotWater;

	public PgDTO() {
		System.out.println("default constrcutor");
	}

	public PgDTO(String name, String location, int rentPrice, AddressDTO addressDTO, double openTime, double closeTime,
			boolean hotWater) {
		super();
		this.name=name;
		this.location = location;
		this.rentPrice = rentPrice;
		this.addressDTO = addressDTO;
		this.openTime = openTime;
		this.closeTime = closeTime;
		this.hotWater = hotWater;
	}

	@Override
	public String toString() {
		return "PgDTO [name=" + name + ", location=" + location + ", rentPrice=" + rentPrice + ", addressDTO="
				+ addressDTO + ", openTime=" + openTime + ", closeTime=" + closeTime + ", hotWater=" + hotWater + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("ovride equals");
		if(obj==null) {
			return false;
			
		}
		if(obj instanceof PgDTO) {
			PgDTO cast=(PgDTO)obj;
			if(this.name!=null && this.location!=null && cast.getName().equals(name) && cast.getLocation().equals(location)) {
				System.out.println("name and location are same");
				return true;
			}else {
				System.out.println("name and location are not same");
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getRentPrice() {
		return rentPrice;
	}

	public void setRentPrice(int rentPrice) {
		this.rentPrice = rentPrice;
	}

	public AddressDTO getAddressDTO() {
		return addressDTO;
	}

	public void setAddressDTO(AddressDTO addressDTO) {
		this.addressDTO = addressDTO;
	}

	public double getOpenTime() {
		return openTime;
	}

	public void setOpenTime(double openTime) {
		this.openTime = openTime;
	}

	public double getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(double closeTime) {
		this.closeTime = closeTime;
	}

	public boolean isHotWater() {
		return hotWater;
	}

	public void setHotWater(boolean hotWater) {
		this.hotWater = hotWater;
	}

}
