package com.infogomes.countryapi.dto;

import java.io.Serializable;

public class LanguageDTO implements Serializable {

	private static final long serialVersionUID = -3721189065197159950L;

	String name;
	String nativeName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNativeName() {
		return nativeName;
	}

	public void setNativeName(String nativeName) {
		this.nativeName = nativeName;
	}

}
