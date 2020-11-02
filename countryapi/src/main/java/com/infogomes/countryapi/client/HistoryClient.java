package com.infogomes.countryapi.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.infogomes.countryapi.dto.HistoryDTO;

@Component
@FeignClient(name = "historycountryapi", path = "/histories")
public interface HistoryClient {

	@PostMapping
	public ResponseEntity<Void> save(@RequestBody HistoryDTO history);
	
}
