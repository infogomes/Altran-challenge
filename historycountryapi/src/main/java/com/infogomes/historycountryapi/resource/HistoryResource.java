package com.infogomes.historycountryapi.resource;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infogomes.historycountryapi.dto.HistoryDTO;
import com.infogomes.historycountryapi.entity.History;
import com.infogomes.historycountryapi.service.HistoryService;

@RestController
@RequestMapping(value = "/histories")
@Validated
public class HistoryResource {

	@Autowired
	private HistoryService historyService;

	@CrossOrigin	
	@GetMapping
	public ResponseEntity<List<History>> findAll() {
		return ResponseEntity.ok().body(this.historyService.findAll());
	}

	@PostMapping
	public ResponseEntity<Void> save(@RequestBody HistoryDTO history) {

		this.historyService.save(LocalDateTime.now(), history.getName());
		return ResponseEntity.noContent().build();
	}	

}
