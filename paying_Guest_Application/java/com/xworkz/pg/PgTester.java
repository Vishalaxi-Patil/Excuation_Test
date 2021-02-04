package com.xworkz.pg;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.pg.dao.PgDAO;
import com.xworkz.pg.dao.PgDAOImpl;
import com.xworkz.pg.dto.AddressDTO;
import com.xworkz.pg.dto.PgDTO;

public class PgTester {

	public static void main(String[] args) {

		AddressDTO addressDTO = new AddressDTO("Rajajinagar", 580010, "Near madhuloka", "Bangalore");
		PgDTO dto1 = new PgDTO("Morning star", "Banglore", 4500, addressDTO, 6.00, 10.30, true);
		PgDTO dto2 = new PgDTO("Guru", "mysore", 5000, addressDTO, 6.30, 11.00, false);
		List<PgDTO> lists = new ArrayList<PgDTO>();

		PgDAO pgDAO = new PgDAOImpl(lists);

		pgDAO.save(dto1);
		
		pgDAO.save(dto2);
		int size=pgDAO.size();
		System.out.println(size);
		pgDAO.addMutiplePgs(lists);
		
	     size=pgDAO.size();
		System.out.println(size);
		
		pgDAO.updateLocationByName("Guru", "Hubli");
		
		List<PgDTO> get=pgDAO.getAll();
		System.out.println(get);
		
		pgDAO.deleteByLocation("Hubli");
		
		int size1=pgDAO.size();
		System.out.println(size1);
		

	}

}
