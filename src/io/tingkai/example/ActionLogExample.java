package io.tingkai.example;

import io.tingkai.enumerations.ModifyType;
import io.tingkai.util.SystemModules;

public class ActionLogExample extends Example {

	@Override
	protected void demo() {
		SystemModules.getActionLogManager().insertNewLog("me", ModifyType.INSERT);
	}
}
