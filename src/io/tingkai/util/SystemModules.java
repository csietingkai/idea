package io.tingkai.util;

import io.tingkai.model.ActionLogManager;
import io.tingkai.model.DateTimeManager;
import io.tingkai.model.IdnoStringHandler;
import io.tingkai.model.Ipv4Manager;

public class SystemModules {

	private static ActionLogManager actionLogManager = new ActionLogManager();
	private static DateTimeManager dateTimeManager = new DateTimeManager();
	private static IdnoStringHandler idnoStringHandler = new IdnoStringHandler();
	private static Ipv4Manager ipv4Manager = new Ipv4Manager();
	
	public static ActionLogManager getActionLogManager() {
		return actionLogManager;
	}
	
	public static DateTimeManager getDateTimeManager() {
		return dateTimeManager;
	}
	
	public static IdnoStringHandler getIdnoStringHandler() {
		return idnoStringHandler;
	}
	
	public static Ipv4Manager getIpv4Manager() {
		return ipv4Manager;
	}
}
