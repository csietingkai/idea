package io.tingkai.model;

import io.tingkai.entity.ActionLog;
import io.tingkai.enumerations.ModifyType;
import io.tingkai.util.SystemModules;

public class ActionLogManager {
	
	public void insertNewLog(String modifier, ModifyType type) {
		new ActionLog(modifier, type, SystemModules.getDateTimeManager().getCurrentDateTime());
		// TODO insert into table or some shit
	}
}
