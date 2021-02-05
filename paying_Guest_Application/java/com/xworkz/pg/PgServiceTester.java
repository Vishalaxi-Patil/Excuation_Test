package com.xworkz.pg;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.pg.dao.PgDAO;
import com.xworkz.pg.dao.PgDAOImpl;
import com.xworkz.pg.dto.AddressDTO;
import com.xworkz.pg.dto.PgDTO;
import com.xworkz.pg.service.PgService;
import com.xworkz.pg.service.PgServiceImpl;

public class PgServiceTester {
	
	public static void main(String[] args) {
		AddressDTO addressDTO=new AddressDTO("Vijayanagar", 5689008, "Near shoba hospital", "Banglore");
		
		PgDTO dto1=new PgDTO("Morning start", "Banglore", 5000, addressDTO, 6.00, 10.00, true);
		
		PgDTO dto2=new PgDTO("Ganesh", "Dharwad", 9000, addressDTO, 6.00, 10.00, true);
		List<PgDTO> pgDTOs=new ArrayList<PgDTO>();
		PgDAO dao=new PgDAOImpl(pgDTOs);
		PgService pgService=new PgServiceImpl(dao);
		pgService.validationAndSave(dto1);
		pgService.getAll();
		//pgService.updateLocationByName("Hubli", "Morning start");
		
		pgService.validationAndSave(dto2);
		pgService.getAll();
		pgService.getByName("Morning start");
		pgService.deleteByLocation("Banglore");
		//pgService.getByName("Morning start");
		
		
		
	}

}
