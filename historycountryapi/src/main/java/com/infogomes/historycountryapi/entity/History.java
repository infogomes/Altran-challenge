package com.infogomes.historycountryapi.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class History implements Serializable {

	private static final long serialVersionUID = 5900530068017119024L;

	
	@Id
	private String id;
	private LocalDateTime date;
	private String country;

	public History() {
	}

	public History(LocalDateTime date, String country) {
		this();
		this.date = date;
		this.country = country;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "History [id=" + id + ", data=" + date + ", country=" + country + "]";
	}

}
