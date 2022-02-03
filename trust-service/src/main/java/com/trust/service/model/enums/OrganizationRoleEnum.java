package com.trust.service.model.enums;

public enum OrganizationRoleEnum {
	BROKER("BROKER"), CORE_PARTNER("CORE_PARTNER"), ADDITIONAL_PARTNER("ADDITIONAL_PARTNER");

	private String code;

	OrganizationRoleEnum(String code) {
		this.code = code;
	}

	public String toString() {
		return code;
	}

}