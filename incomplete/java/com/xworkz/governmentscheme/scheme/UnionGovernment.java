package com.xworkz.governmentscheme.scheme;

public abstract class UnionGovernment {
	
	protected String name;
	
	
	protected UnionGovernment() {
		System.out.println("UnionGovernment called as deault constructor");
	}
	public void atalPensionYogana() {
		System.out.println("invoked method atalPensionYogana");
	}
	public abstract void ayushmanBharat();
	
	public void name()
	{
		System.out.println("name");
	}
	
	
}

