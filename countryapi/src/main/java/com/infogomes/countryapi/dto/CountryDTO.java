package com.infogomes.countryapi.dto;

import java.io.Serializable;
import java.util.List;

public class CountryDTO implements Serializable {

	private static final long serialVersionUID = -4882102770508446795L;

	private String name;
	private String nativeName;
	private String flag;
	private List<LanguageDTO> languages;
	private String region;
	private String subregion;

	public CountryDTO() {
	}

	public CountryDTO(String name, String nativeName, String flag, List<LanguageDTO> languages) {
		super();
		this.name = name;
		this.nativeName = nativeName;
		this.flag = flag;
		this.languages = languages;
	}

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

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public List<LanguageDTO> getLanguages() {
		return languages;
	}

	public void setLanguages(List<LanguageDTO> languages) {
		this.languages = languages;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getSubregion() {
		return subregion;
	}

	public void setSubregion(String subregion) {
		this.subregion = subregion;
	}

}
