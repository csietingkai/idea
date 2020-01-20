package io.tingkai.entity;

import io.tingkai.enumerations.ModifyType;

public class ActionLog {
	
	private String modifier;
	private ModifyType modifyType;
	private long modifyTime;
	
	public ActionLog() { }
	
	public ActionLog(String modifier, ModifyType modifyType, long modifyTime) {
		super();
		this.modifier = modifier;
		this.modifyType = modifyType;
		this.modifyTime = modifyTime;
	}

	public String getModifier() {
		return modifier;
	}
	
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}
	
	public ModifyType getModifyType() {
		return modifyType;
	}
	
	public void setModifyType(ModifyType modifyType) {
		this.modifyType = modifyType;
	}
	
	public long getModifyTime() {
		return modifyTime;
	}
	
	public void setModifyTime(long modifyTime) {
		this.modifyTime = modifyTime;
	}
}
