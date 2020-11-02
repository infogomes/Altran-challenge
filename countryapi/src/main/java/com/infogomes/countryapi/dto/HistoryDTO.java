package com.infogomes.countryapi.dto;

import java.io.Serializable;

public class HistoryDTO implements Serializable {

	private static final long serialVersionUID = -3998025475610397419L;

	private String name;

	public HistoryDTO() {
	}

	public HistoryDTO(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
