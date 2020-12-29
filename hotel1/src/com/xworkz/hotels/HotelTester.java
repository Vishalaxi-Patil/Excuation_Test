package com.xworkz.hotels;

import com.xworkz.hotels.constants.Location;
import com.xworkz.hotels.dto.HotelDTO;
import com.xworkz.hotels.hotelOperation.HotelOperation;

public class HotelTester {

	public static void main(String[] args) {
		String[] foodItems= {"Dosa","idli"," veg Biriyani","Gobimanchuri","Pani puri"};
		HotelDTO hotelDTO=new HotelDTO("Ayodya",Location.HUBLI, "Anu", "veg", true, foodItems);
		HotelOperation hotelOperation=new HotelOperation();
		hotelOperation.acceptInformation(hotelDTO);
		hotelOperation.displayInfo();
		
		HotelDTO hotelDTO1=new HotelDTO("pingar",Location.HUBLI, "Aishwarya", "veg", true, foodItems);
		HotelOperation hotelOperation1=new HotelOperation();
		hotelOperation1.acceptInformation(hotelDTO1);
		hotelOperation1.displayInfo();
		
		HotelDTO hotelDTO2=new HotelDTO("Durga",Location.HAVERI, "Vishalaxi", "non veg", false, foodItems);
		HotelOperation hotelOperation2=new HotelOperation();
		hotelOperation2.acceptInformation(hotelDTO2);
		hotelOperation2.displayInfo();
		
		hotelOperation1.returnOwnerName("pingar");
		hotelOperation1.serachHotel(Location.HUBLI,"pingar");
		
		
		
		
		
	
	    
		
		
	

	}

}
