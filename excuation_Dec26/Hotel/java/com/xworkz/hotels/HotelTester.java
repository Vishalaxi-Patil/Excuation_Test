package com.xworkz.hotels;

import java.util.Arrays;

import com.xworkz.hotels.hotel.Hotel;

public class HotelTester {

	public static void main(String[] args) {
	    Hotel hotel=new Hotel();
	    String[] foodItems= {"Dosa","Puri","Avalaki","Palava","roti","Masala dosa","Rice","Vegitable rice","Gobi","Panupuri"};
	    String name=Arrays.toString(foodItems);
	    hotel.hotelInformation("Ayodya","Hubli", foodItems);
	    System.out.println("Food items in the Hotel::"+name);
	    System.out.println("*************************************");
	    hotel.displayAllInformation("Asshirvad", "Dharwad","Kallanagouda","Veg",true, foodItems);
	    System.out.println("********************************");
	    hotel.owerName("santosh", "Ayodya");
	    
	    hotel.searchHotel("Lakshi","Hubli", "Ayodya");
	    
}
}
