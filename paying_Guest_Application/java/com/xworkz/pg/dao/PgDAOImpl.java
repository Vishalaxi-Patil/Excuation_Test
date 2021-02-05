package com.xworkz.pg.dao;

import java.util.Iterator;
import java.util.List;

import com.xworkz.pg.dto.PgDTO;

public class PgDAOImpl implements PgDAO{
	
	private List<PgDTO> pgDtos;
	
	public PgDAOImpl(List<PgDTO> pgDTOs) {
		this.pgDtos=pgDTOs;
	}

	@Override
	public boolean save(PgDTO pgDTO) {
		if(pgDTO!=null) {
		System.out.println("Invoked save");
		boolean saved=false;
		saved=this.pgDtos.add(pgDTO);
		if(saved) {
			System.out.println("dto is saved"+pgDTO);
			//this.pgDtos.add(pgDTO);
			return true;
		}else {
			System.out.println("dto is not saved");
		}
		}
		return false;
		
		
	}

	@Override
	public boolean  updateLocationByName(String name,String location) {
		if(name!=null) {
			System.out.println("Invoked updateLocationByName");
		    for (PgDTO pgDTO : pgDtos) {
		    	if(pgDTO.getName()!=null && name!=null && pgDTO.getName().equals(name)) {
		    		System.out.println("name is found so upadte Location");
		    		pgDTO.setLocation(location);
		    		System.out.println("pgDTO:"+pgDTO);
		    		return true;
		    	}else {
		    		System.out.println("name not found");
		    	}
				
			}
		}
		return false;
		
	}

	@Override
	public boolean deleteByLocation(String location) {
		if(location!=null) {
			System.out.println("Invoked deleteByLocation");
			System.out.println("arg1:"+location);
			Iterator< PgDTO> iterator=pgDtos.iterator();
			while(iterator.hasNext()) {
				PgDTO next=iterator.next();
				String getLocation=next.getLocation();
				System.out.println(getLocation);
				if(getLocation.equals(location)) {
					System.out.println("Location is found so delete");
					System.out.println("Remove:"+pgDtos);
					iterator.remove();
					return true;
				}else {
					System.out.println("Location is not found");
				}
				
				
			}
		}
		return false;
	}

	@Override
	public int size() {
		
		return this.pgDtos.size();
	}

	@Override
	public List<PgDTO> getAll() {
		System.out.println("Invoked getAll");
		return this.pgDtos;
	}

	@Override
	public boolean addMutiplePgs(List<PgDTO> dtos) {
		if(dtos!=null) {
			System.out.println("Invoked addMutiplePgs");
			System.out.println("arg1:"+dtos);
			boolean added=dtos.addAll(pgDtos);
			System.out.println("added:"+added);
		}
		return false;
	}

	@Override
	public boolean findByName(String name) {
		System.out.println("find by name");
		for (PgDTO pgDTO : pgDtos) {
			if(pgDTO.getName().equals(name)) {
				System.out.println(pgDTO);
			}
			
		}
		return false;
	}

	

}
