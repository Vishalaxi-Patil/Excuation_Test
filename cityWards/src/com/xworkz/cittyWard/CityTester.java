package com.xworkz.cittyWard;

import com.xworkz.cittyWard.citywardoperation.WardOperation;
import com.xworkz.cittyWard.constans.WardName;
import com.xworkz.cittyWard.dto.CityWardDTO;

public class CityTester {
	public static void main(String[] args) {
		CityWardDTO cityWardDTO = new CityWardDTO(786, WardName.CHAUDESHWARI, "Vena", 50000, "1 sqkm");
		CityWardDTO cityWardDTO2 = new CityWardDTO(555, WardName.Attur, "vishalaxi", 50000, "1 sqkm");
		CityWardDTO cityWardDTO3 = new CityWardDTO(777, WardName.KEMPEGOUDA, "Vinay", 50000, "1 sqkm");
		WardOperation wardOperation = new WardOperation();
		
		wardOperation.acceptInfo(cityWardDTO);
		wardOperation.acceptInfo(cityWardDTO2);
		wardOperation.acceptInfo(cityWardDTO3);
		wardOperation.serachCity(WardName.Attur,787);
		wardOperation.returnCorporator(555);
		wardOperation.displayAllInfo();
		
//		System.out.println("**************************************");
//		CityWardDTO cityWardDTO2 = new CityWardDTO(420, WardName.KEMPEGOUDA, "yashoda", 14000, "100 sqkm");
//		WardOperation wardOperation2=new WardOperation();
//		wardOperation2.acceptInfo(cityWardDTO2);
//		wardOperation2.serachCity(WardName.KEMPEGOUDA,420);
//		wardOperation2.returnCorporator(420);
//		wardOperation2.displayAllInfo();
//		System.out.println("********************************");
//		CityWardDTO cityWardDTO3=new CityWardDTO(2345,WardName.VIJAYANAGAR,"Kavita",6000,"10 qskm" );
//		wardOperation.acceptInfo(cityWardDTO3);
//		wardOperation.serachCity(WardName.KEMPEGOUDA,420);
//		wardOperation.returnCorporator(2345);
		
	}

}
