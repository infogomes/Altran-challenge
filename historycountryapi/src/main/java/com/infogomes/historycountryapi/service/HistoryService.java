package com.infogomes.historycountryapi.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.infogomes.historycountryapi.entity.History;
import com.infogomes.historycountryapi.repository.HistoryRepository;

@Service
public class HistoryService {

	@Autowired
	private HistoryRepository historyRepository;

	public List<History> findAll() {
		return this.historyRepository.findAll(Sort.by(Sort.Direction.DESC, "date"));
	}

	public History save(LocalDateTime date, String country) {
		return this.historyRepository.save(new History(date, country));
	}
}
