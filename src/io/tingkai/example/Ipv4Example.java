package io.tingkai.example;

import io.tingkai.util.SystemModules;

public class Ipv4Example extends Example {

	@Override
	protected void demo() {
		String ip = SystemModules.getIpv4Manager().generate();
		System.out.println("generate random ip: " + ip);
		System.out.println("check " + ip + " is correct format: " + SystemModules.getIpv4Manager().verify(ip));
	}
}
