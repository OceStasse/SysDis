package com.inpres.main;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.inpres.ejb.business.IPatient;

public class Main {

	public static void main(String[] args) {
		try {
			//create the context for the EJB
		      InitialContext context = new InitialContext();
		      IPatient patientService = (IPatient)context.lookup("ServicePatient") ;
		      System.out.println(patientService.sayHello()) ;
				
	      } catch (NamingException e) {
	         e.printStackTrace();
	      }

	}

}
