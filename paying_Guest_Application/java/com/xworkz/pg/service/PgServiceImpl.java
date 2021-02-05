package com.xworkz.pg.service;

import java.util.List;

import com.xworkz.pg.dao.PgDAO;
import com.xworkz.pg.dto.AddressDTO;
import com.xworkz.pg.dto.PgDTO;

public class PgServiceImpl implements PgService {

	private PgDAO pgDAO;

	public PgServiceImpl(PgDAO pgDAO) {
		this.pgDAO = pgDAO;

	}

	@Override
	public boolean validationAndSave(PgDTO pgDTO) {
		System.out.println("Invoked validationAndSave");
		boolean valiData = false;
		if (pgDTO != null) {
			System.out.println("pgDTO is not null so validate the fields");
		
		String name = pgDTO.getName();
		System.out.println(name);
		if (name != null) {
			System.out.println("if loop");
			System.out.println("name is valid");
			valiData = true;
		} else {
			System.out.println("name is not valid");
			valiData = false;
		}
		if (valiData) {
			String location = pgDTO.getLocation();
			if (location != null && !location.isEmpty() && !location.contains(" ") && location.length() >= 3) {
				System.out.println("loaction is valid");
				valiData = true;
			} else {
				System.out.println("location is not valid");
				valiData = false;
			}
		}
		if (valiData) {
			int price = pgDTO.getRentPrice();
			if (price > 0 && price <= 10000) {
				System.out.println("rent price is valid");
				valiData = true;
			} else {
				System.out.println("rent price is not valid");
				valiData = false;
			}
		}
		if (valiData) {
			AddressDTO address = pgDTO.getAddressDTO();
			if (address != null) {
				System.out.println("Valid address");
				valiData = true;
			} else {
				System.out.println("invalid address");
				valiData = false;
			}
		}
		if (valiData) {
			double openTime = pgDTO.getOpenTime();
			if (openTime > 0) {
				System.out.println("open time is valid");
				valiData = true;
			} else {
				System.out.println("open is not valid");
				valiData = false;
			}
			if (valiData) {
				double closeTime = pgDTO.getCloseTime();
				if (closeTime > 0) {
					System.out.println("close time is valid");
					valiData = true;
				} else {
					System.out.println("close time is not valid");
					valiData = false;
				}
			}
			if(valiData) {
				System.out.println("all data are valid so save to dao");
				pgDAO.save(pgDTO);
			}
		}else {
			System.out.println("dto is null");
		}

		}
		return valiData;
	}

	@Override
	public List<PgDTO> getAll() {
		System.out.println("Invoked get All in service");
		List<PgDTO> getAll=pgDAO.getAll();
		System.out.println("GetAll:"+getAll);
		return getAll;
	}

	@Override
	public boolean updateLocationByName(String location, String name) {
		if((name != null) && (location != null && !location.isEmpty() && !location.contains(" ") && location.length() >= 3)) {
			System.out.println("location and name are  valid so upadte location");
			pgDAO.updateLocationByName(name, location);
		}
		return false;
	}

	@Override
	public boolean getByName(String name) {
		System.out.println("Invoked findByName in service");
		if(name != null) {
			
		System.out.println("name is valid so getByName ");
		pgDAO.findByName(name);
		}
		return false;
	}

	@Override
	public boolean deleteByLocation(String location) {
		System.out.println("Invoked deleteByLocation in service");
		if(location != null && !location.isEmpty() && !location.contains(" ") && location.length() >= 3) {
			System.out.println("location so delete");
			pgDAO.deleteByLocation(location);
		}
		return false;
	}

	
	
	
}
