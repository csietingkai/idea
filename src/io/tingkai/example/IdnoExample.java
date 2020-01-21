package io.tingkai.example;

import io.tingkai.util.SystemModules;

public class IdnoExample extends Example {

	@Override
	protected void demo() {
		String idno = SystemModules.getIdnoManager().generate();
		System.out.println("generate random id: " + idno);
		System.out.println("check " + idno + " is correct format: " + SystemModules.getIdnoManager().verify(idno));
	}
}
