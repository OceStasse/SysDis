package com.inpres.ejb.businesslogic;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.inpres.ejb.business.IPatient;

@Stateless(mappedName="ServicePatient")
@Remote

public class SessionBeanPatient implements IPatient {

	@Override
	public String sayHello() {
		return "Hello World";
	}

}
