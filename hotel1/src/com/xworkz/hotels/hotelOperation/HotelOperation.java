package com.xworkz.hotels.hotelOperation;

import java.util.Arrays;

import com.xworkz.hotels.constants.Location;
import com.xworkz.hotels.dto.HotelDTO;

public class HotelOperation {

	HotelDTO[] hotelDTO = new HotelDTO[5];
	private int currentIndex = 0;

	public void acceptInformation(HotelDTO dto) {
		System.out.println("****acceptInformation****");
		if (dto != null && currentIndex < 6) {
			String name = dto.getName();
			Location location = dto.getLocation();
			String[] foodItems = dto.getFoodItems();
			if (name != null && location != null && foodItems != null) {
				System.out.println("We can add information of Hotel");
				System.out.println("Current Index::" + currentIndex);
				this.hotelDTO[this.currentIndex] = dto;
				currentIndex++;
			} else {
				System.out.println("cannot add information of Hotel because data is invalid");
			}

		}
	}

	public void serachHotel(Location location, String name) {
		System.out.println("******serachHotel*********");
		if (location != null && name != null) {
			boolean start = false;
			for (int v = 0; v < hotelDTO.length; v++) {
				HotelDTO ref = this.hotelDTO[v];
				if (ref != null) {
					//HotelDTO ref = this.hotelDTO[v];
					Location location2 = ref.getLocation();
					String name1 = ref.getName();
					if (location2.equals(location) && name1.equals(name)) {
						System.out.println("Displaying all the information of the " +name+ " Hotel which is present in " +location);
						System.out.println("Name of the hotel::" + ref.getName());
						System.out.println("Location of the Hotel::" + ref.getLocation());
						System.out.println("Owner name of the Hotel::" + ref.getOwnerName());
						System.out.println("Type of the Hotel::" + ref.getType());
						System.out.println("self service::" + ref.isService());
						//System.out.println("Food items of the Hotel::" + ref.getFoodItems());
						System.out.println("Food items of the Hotel::" +Arrays.toString(ref.getFoodItems()));
						start = true;
						break;
					}
				} 
			}
			if(start==false) {
				System.out.println("Hotel not found");
				
			}
				
			}
		}
	

	public void displayInfo() {
		System.out.println("*******displayInfo**********");
		for (int s = 0; s < hotelDTO.length; s++) {
			HotelDTO hotelDTO = this.hotelDTO[s];
			if (hotelDTO != null) {
				{
					System.out.println("*********************************");
					System.out.println("displaying all the information Hotel");
					System.out.println("Name of the hotel::" + hotelDTO.getName());
					System.out.println("Location of the Hotel::" + hotelDTO.getLocation());
					System.out.println("Owner name of the Hotel::" + hotelDTO.getOwnerName());
					System.out.println("Type of the Hotel::" + hotelDTO.getType());
					System.out.println("self service::" + hotelDTO.isService());
					System.out.println("Food items of the Hotel::" +Arrays.toString(hotelDTO.getFoodItems()));
					System.out.println("********************************");

				}

			}
		}
	}

	public void returnOwnerName(String name) {
		System.out.println("************returnOwnerName***************");
		if (name != null) {
			boolean start = false;
			for (int t = 0; t < this.hotelDTO.length; t++) {
				if (this.hotelDTO[t] != null) {
					HotelDTO ref = this.hotelDTO[t];
					String name1 = ref.getName();
					if (name1.equals(name)) {
						//System.out.println("owner name::" + ref.getOwnerName()+ " for " +name);
						System.out.println(ref.getOwnerName() + " is the owner for hotel "+name);
						start = true;
						break;

					}
				}
			}
			if(start == false)
			{
				System.out.println("Owner not found");
			}
		}
	}

}
