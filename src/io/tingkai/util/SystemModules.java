package io.tingkai.util;

import io.tingkai.model.ActionLogManager;
import io.tingkai.model.DateTimeManager;
import io.tingkai.model.IdnoManager;
import io.tingkai.model.Ipv4Manager;
import io.tingkai.model.PasswordManager;

public class SystemModules {

	private static ActionLogManager actionLogManager = new ActionLogManager();
	private static DateTimeManager dateTimeManager = new DateTimeManager();
	private static IdnoManager idnoManager = new IdnoManager();
	private static Ipv4Manager ipv4Manager = new Ipv4Manager();
	private static PasswordManager passwordManager = new PasswordManager();
	
	public static ActionLogManager getActionLogManager() {
		return actionLogManager;
	}
	
	public static DateTimeManager getDateTimeManager() {
		return dateTimeManager;
	}
	
	public static IdnoManager getIdnoManager() {
		return idnoManager;
	}
	
	public static Ipv4Manager getIpv4Manager() {
		return ipv4Manager;
	}
	
	public static PasswordManager getPasswordManager() {
		return passwordManager;
	}
}
