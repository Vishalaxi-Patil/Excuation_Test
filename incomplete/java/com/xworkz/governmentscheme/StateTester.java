package com.xworkz.governmentscheme;

import com.xworkz.governmentscheme.scheme.UnionGovernment;
import com.xworkz.governmentscheme.states.KarnatakaGovernment;

public class StateTester {

	public static void main(String[] args) {
		//UnionGovernment unionGovernment=new UnionGovernment();this class is abstarct
		KarnatakaGovernment karnatakaGovernment = new KarnatakaGovernment();
		karnatakaGovernment.atalPensionYogana();
		karnatakaGovernment.ayushmanBharat();
		

		UnionGovernment unionGovernment = new KarnatakaGovernment();
		unionGovernment.atalPensionYogana();
		unionGovernment.ayushmanBharat();

		Number number = new Integer(56);
		number = new Double(78);
		// Object object=new Number();error:Cannot instantiate the type Number
		Object number1 = new Integer(45);
		// Number number2=new Number();error:Cannot instantiate the type Number
		// Number:Example for abstract class

	}

}
