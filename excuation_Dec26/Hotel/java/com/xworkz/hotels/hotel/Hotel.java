package com.xworkz.hotels.hotel;

public class Hotel {
	private String name;
	private String location;
	private String owerName;
	private String type;
	private boolean service;
	private String[] foodItems;

	/**
	 * hotelInformation method will display the name,location and food items
	 * 
	 * @param name
	 * @param location
	 * @param foodItems
	 */
	public void hotelInformation(String name, String location, String[] foodItems) {
		System.out.println("Invoked hotelInformation method");
		if (name != null && location != null && foodItems != null) {
			System.out.println("name of hotel::" + name);
			System.out.println("location of hotel::" + location);
			System.out.println("food items in the hotel::" + foodItems);
		} else {
			System.out.println("invalid information");
		}
	}

	public void displayAllInformation(String name, String location, String owerName, String type, boolean service,
			String[] foodItems)

	{
         System.out.println("Invoked displayAllInformation method");
         System.out.println("Name of the hotel::"+name);
         System.out.println("location of Hotel::"+location);
         System.out.println("OwerName of the hotel::"+owerName);
         System.out.println("type of hotel::"+type);
         System.out.println("self service::"+service);
         System.out.println("food items of the Hotel::"+foodItems);
	}
	public boolean owerName(String owerName,String hotelName)
	{
		boolean owername=false;
		if(hotelName.equals(owerName))
		{
			owername=true;
			System.out.println(hotelName+"hotel owername"+owerName);
		}else {
			System.out.println("Owername not found");
		}
		return owername;
	}
	public void searchHotel(String name,String location,String nameOfHotel)
	{
		if(name.equals(location))
		{
			System.out.println("name of the hotel::"+nameOfHotel);
		}else {
			System.out.println("hotel not found");
		}
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

	public String getOwerName() {
		return owerName;
	}

	public void setOwerName(String owerName) {
		this.owerName = owerName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String[] getFoodItems() {
		return foodItems;
	}

	public void setFoodItems(String[] foodItems) {
		this.foodItems = foodItems;
	}

	public boolean isService() {
		return service;
	}

	public void setService(boolean service) {
		
			this.service = service;
		
	}

}
