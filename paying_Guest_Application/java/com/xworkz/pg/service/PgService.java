package com.xworkz.pg.service;

import java.util.List;

import com.xworkz.pg.dto.PgDTO;

public interface PgService {
	
	public boolean validationAndSave(PgDTO pgDTO);
	
	List<PgDTO> getAll();
	
	boolean updateLocationByName(String location, String name);
	
	boolean getByName(String name);
	
	public boolean deleteByLocation(String location);
	
     

}
