package io.tingkai;

import io.tingkai.enumerations.ModifyType;
import io.tingkai.util.SystemModules;

public class IdeaApplication {

	public static void main(String[] args) {
		SystemModules.getActionLogManager().insertNewLog("me", ModifyType.INSERT);
		
		long datetime = SystemModules.getDateTimeManager().generate();
		System.out.println(datetime);
		
		String idno = SystemModules.getIdnoStringHandler().generate();
		System.out.println(idno + ": " +  SystemModules.getIdnoStringHandler().verify(idno));
		
		String ip = SystemModules.getIpv4Manager().generate();
		System.out.println(ip + ": " + SystemModules.getIpv4Manager().verify(ip));
		
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu/MM/dd-HH:mm:ss.SSS").withZone(ZoneId.of("Asia/Taipei"));
//		Instant instant = Instant.ofEpochMilli(1575432344881L);
//		System.out.println(formatter.format(instant));
//		
//		Example streamMapExample = new StreamMapExample();
//		streamMapExample.run();
//		
//		Example passwordCheckerExample = new PasswordCheckerExample();
//		passwordCheckerExample.run();
		
//		System.out.println(ManagerUtil.getActionLogManager().getCurrentDate(true));
//		System.out.println(ManagerUtil.getActionLogManager().getCurrentDate(false));
//		System.out.println(ManagerUtil.getActionLogManager().getCurrentTime(true));
//		System.out.println(ManagerUtil.getActionLogManager().getCurrentTime(false));
//		System.out.println(ManagerUtil.getActionLogManager().getCurrentDateTime(true));
//		System.out.println(ManagerUtil.getActionLogManager().getCurrentDateTime(false));
		
//		System.out.println(LocalDateTime.ofInstant(Instant.ofEpochMilli(1579507470793L), ZoneId.of("Asia/Taipei")));
	}
}
