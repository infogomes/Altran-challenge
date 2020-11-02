package com.infogomes.countryapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.infogomes.countryapi.client.HistoryClient;
import com.infogomes.countryapi.dto.CountryDTO;
import com.infogomes.countryapi.dto.HistoryDTO;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class CountryService {

	@Autowired
	private RestTemplate template;

	@Autowired
	private HistoryClient historyClient;

	@HystrixCommand(fallbackMethod = "fingByNameAltgernative", ignoreExceptions = HttpClientErrorException.class)
	public CountryDTO findByName(String name) {

		try {
			ResponseEntity<CountryDTO[]> countryResponse = template.exchange(
					"https://restcountries.eu/rest/v2/name/" + name + "?fullText=true", HttpMethod.GET, null,
					CountryDTO[].class);

			historyClient.save(new HistoryDTO(countryResponse.getBody()[0].getName()));

			return countryResponse.getBody()[0];

		} catch (HttpClientErrorException.NotFound e) {
			throw new HttpClientErrorException(HttpStatus.NOT_FOUND, "Country not found");
		}

	}

	public CountryDTO fingByNameAltgernative(String name, Throwable e) {
		throw new HttpClientErrorException(HttpStatus.SERVICE_UNAVAILABLE, "Service Unavailable");
	}

	public CountryDTO findByNameWithSave(String name) {

		try {
			ResponseEntity<CountryDTO[]> countryResponse = template.exchange(
					"https://restcountries.eu/rest/v2/name/" + name + "?fullText=true", HttpMethod.GET, null,
					CountryDTO[].class);

			return countryResponse.getBody()[0];

		} catch (HttpClientErrorException.NotFound e) {
			throw new HttpClientErrorException(HttpStatus.NOT_FOUND, "Country not found");
		}

	}

}
