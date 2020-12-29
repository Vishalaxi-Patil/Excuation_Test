package com.xworkz.flight.flightbookingoperation;

import com.xworkz.flight.constants.Company;
import com.xworkz.flight.dto.FlightDTO;

public class BookingOperation {

	FlightDTO[] dtos = new FlightDTO[5];
	private int currentIndex = 0;

	public void AcceptBooking(FlightDTO dto) {
		if (dto != null && currentIndex < 6) {
			String airplaneCode = dto.getAirplaneCode();
			String startingPoint = dto.getStartingPoint();
			String destination = dto.getDestination();
			int totalSeats = dto.getTotalSeats();
			boolean domestic = dto.isDomestic();
			double businessClassPrice = dto.getBusinessClassPrice();
			double economyClassPrice = dto.getEconomyClassPrice();
			Company company = dto.getCompany();
			if (airplaneCode != null && startingPoint != null && destination != null && totalSeats >= 0
					&& businessClassPrice >= 1000 && economyClassPrice >= 0 && company != null) {
				System.out.println("we can add flight");
				System.out.println("Current Index::" + currentIndex);
				this.dtos[this.currentIndex] = dto;
				currentIndex++;
			} else {
				System.out.println("We cannot add flight,becuase data is flight");
			}
		}
	}
	public void displayStartingPoint(String startingPoint)
	{
		if(startingPoint!=null)
		{
			boolean start=false;
			for(int i=0;i<dtos.length;i++)
			{
				FlightDTO flightDTO=this.dtos[i];
				if(flightDTO!=null)
				{
					FlightDTO ref=this.dtos[i];
					String localRef=ref.getStartingPoint();
					if(localRef.equals(startingPoint))
					{
						System.out.println("displayStartingPoint****************************");
						System.out.println("Starting point is::"+ref.getStartingPoint());
						System.out.println("Code::"+ref.getAirplaneCode());
						System.out.println("getBusinessClassPrice::"+ref.getBusinessClassPrice());
						System.out.println("getDestination::"+ref.getDestination());
						System.out.println("getEconomyClassPrice::"+ref.getEconomyClassPrice());
						System.out.println("getTotalSeats::"+ref.getTotalSeats());
						System.out.println("isDomestic::"+ref.isDomestic());
						System.out.println("getCompany::"+ref.getCompany());
						start=true;
						break;
					}
				}else
					{
						if(start==false)
						{
							System.out.println("Starting point is not found");
						}
					}
				}
			}
		
		
	}
	public void displayInfo()
	{
		
		for(int i=0;i<dtos.length;i++)
		{
			FlightDTO dto=this.dtos[i];
			if(dto!=null)
			{
				System.out.println("displayInfo**********************************");
				System.out.println("Code::"+dto.getAirplaneCode());
				System.out.println("BusinessClassPrice::"+dto.getBusinessClassPrice());
				System.out.println("Destination::"+dto.getDestination());
				System.out.println("EconomyClassPrice::"+dto.getEconomyClassPrice());
				System.out.println("StartingPoint::"+dto.getStartingPoint());
				System.out.println("TotalSeats::"+dto.getTotalSeats());
				System.out.println("Company::"+dto.getCompany());
				System.out.println("Domestic::"+dto.isDomestic());
			}
		}
	}

}
