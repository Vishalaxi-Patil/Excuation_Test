package com.xworkz.pg.service;

import com.xworkz.pg.dao.PgDAO;
import com.xworkz.pg.dto.PgDTO;

public class PgServiceImpl  implements PgService{
	
	private PgDAO pgDAO;
	
	public PgServiceImpl(PgDAO pgDAO) {
		this.pgDAO=pgDAO;
		
	}


	@Override
	public boolean validationAndSave(PgDTO pgDTO) {
		System.out.println("Invoked validationAndSave");
		boolean valiData=false;
		if(pgDTO!=null) {
			System.out.println("pgDTO is not null so validate the fields");
		}
		String name=pgDTO.getName();
		if(name!=null && !name.isEmpty() && !name.contains(" ") && name.length()>=3) {
			System.out.println("name is valid");
			valiData=true;
		}else {
			System.out.println("name is not valid");
			valiData=false;
		}
		if(valiData) {
			String location=pgDTO.getLocation();
			if(location!=null && !location.isEmpty() && !location.contains(" ") && location.length()>=3) {
				System.out.println("loaction is valid");
				valiData=true;
			}else {
				System.out.println("location is not valid");
				valiData=false;
			}
		}
		return false;
		
		

}
}
