package com.xworkz.pg.dao;

import java.util.List;

import com.xworkz.pg.dto.PgDTO;

public interface PgDAO {

	public boolean save(PgDTO pgDTO);
	
	public boolean addMutiplePgs(List<PgDTO> dtos);

	public boolean updateLocationByName(String name, String location);

	public List<PgDTO> getAll();

	public boolean deleteByLocation(String location);

	public int size();
	
	public boolean findByName(String name);

}
