package com.xworkz.cittyWard.citywardoperation;

import com.xworkz.cittyWard.constans.WardName;
import com.xworkz.cittyWard.dto.CityWardDTO;

public class WardOperation {
	
	CityWardDTO[] dtos=new CityWardDTO[5];
	private int currentIndex=0;
	
	public void acceptInfo(CityWardDTO dto)
	{
		System.out.println("acceptInfo************");
		if(dto!=null && currentIndex<5)
		{
			int wardNo=dto.getWardNo();
			WardName wardName=dto.getWardName();
			int population=dto.getPopulation();
			if(wardNo>0 && wardName!=null && population>=5000) {
				System.out.println("We can add information of cityward and populatio is grater than 5000");
				System.out.println("Current Index::"+currentIndex);
				this.dtos[this.currentIndex]=dto;
				currentIndex++;
				System.out.println("city ward is added "+wardName);
			}else {
				System.out.println("We cannot  add information because data is not valid and population less than 5000");
			}
		}
	}
	public void serachCity(WardName name,int number)
	{
		System.out.println("serachCity**************");
		if(name!=null) {
			boolean start = false;
			for(int k=0;k<dtos.length;k++) {
				CityWardDTO ref=this.dtos[k];
				if(ref!=null) {
					WardName name1=ref.getWardName();
					int number1=ref.getWardNo();
				     if(name1.equals(name) || number1==number) {
				    	 //System.out.println(" arg1 ward name is found::"+name);
				    	 System.out.println("displaying all the information of city ward for ward name " +name+ " and ward number " +number);
				    	 System.out.println("Ward name::"+ref.getWardName());
				    	 System.out.println("Ward number::"+ref.getWardNo());
				    	 System.out.println("corporator name::"+ref.getCorporateName());
				    	 System.out.println("population::"+ref.getPopulation());
				    	 System.out.println("area in sqkm::"+ref.getArea());
				    	 start=true;
				    	 break;
				    	 
				     }
				}else {
					System.out.println("City not found");
					break;
				}
			}
			
		}
	}
	public void returnCorporator(int wardNumber)
	{
		System.out.println("returnCorporator**************");
		if(wardNumber>0) {
			boolean start=false;
			for(int j=0;j<dtos.length;j++) {
				CityWardDTO ref=this.dtos[j];
				if(ref!=null) {
					int no=ref.getWardNo();
					if(no==wardNumber) {
						System.out.println("Corporator name::"+ref.getCorporateName()+ " for wrad number " +wardNumber);
						start=true;
					}
				}
			}
		}else {
			System.out.println("corporator name not found");
		}
	}
	public void displayAllInfo() {
		System.out.println("displayAllInfo****************");
		for(int p=0;p<dtos.length;p++) {
			CityWardDTO ref=this.dtos[p];
			if(ref!=null) {
				System.out.println("*****************************************");
				System.out.println("Displaying all the information of the city wards");
				System.out.println("Ward number::"+ref.getWardNo());
				System.out.println("ward name::"+ref.getWardName());
				System.out.println("corporator name::"+ref.getCorporateName());
				System.out.println("population::"+ref.getPopulation());
				System.out.println("Area in sq kilo meters::"+ref.getArea());
				System.out.println("*******************************************");
			}
		}
	}

}
