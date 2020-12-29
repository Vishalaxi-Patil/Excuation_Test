package com.xworkz.flight;

import com.xworkz.flight.constants.Company;
import com.xworkz.flight.dto.FlightDTO;
import com.xworkz.flight.flightbookingoperation.BookingOperation;

public class FlightTester {

	public static void main(String[] args) {
		
		FlightDTO flightDTO = new FlightDTO("INDIA143", "Banglore", "Gadag", 5, true, 1000, 60000, Company.INDIGO);
		BookingOperation bookingOperation=new BookingOperation();
		bookingOperation.AcceptBooking(flightDTO);
		bookingOperation.displayInfo();
		
		System.out.println("***********************************");
		
		FlightDTO flightDTO2=new FlightDTO("INDIA898","Gadag", "Banglore", 3, false, 2000, 4000,Company.KINGFISHER);
		//BookingOperation bookingOperation2=new BookingOperation();
		bookingOperation.AcceptBooking(flightDTO2);
		bookingOperation.displayInfo();
		
		System.out.println("****************************************");
		
		FlightDTO flightDTO3=new FlightDTO("AIR456","Maharastra","Delhi",2, true, 30000, 60000,Company.VISTARA);
		//BookingOperation bookingOperation3=new BookingOperation();
		bookingOperation.AcceptBooking(flightDTO3);
		bookingOperation.displayInfo();
		
		System.out.println("**************************************");
		
		bookingOperation.displayStartingPoint("Delhi");
		
		FlightDTO flightDTO4=new FlightDTO("INDIA456","Dharwad", "Lacknow", 3,false, 10000, 6000,Company.INDIGO);
		System.out.println("****************************");
		bookingOperation.AcceptBooking(flightDTO4);
		System.out.println("*************************");
		//bookingOperation.displayInfo();
		
		bookingOperation.displayStartingPoint("Dharwad");
		

	}

}




