package com.infogomes.countryapi.resource;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infogomes.countryapi.dto.CountryDTO;
import com.infogomes.countryapi.service.CountryService;

@RestController
@RequestMapping(value = "/countries")
@Validated
public class CountryResouce {

	@Autowired
	private CountryService countryService;

	@CrossOrigin	
	@GetMapping
	public ResponseEntity<CountryDTO> fingByName(
			@RequestParam
			@Valid 
			@NotBlank(message = "Required field") 
			@Size(min = 3, max = 30, message = "This field needs at least 3 caracteres and maximum 30") 
			String name) {
		return ResponseEntity.ok().body(this.countryService.findByName(name));
	}
}
