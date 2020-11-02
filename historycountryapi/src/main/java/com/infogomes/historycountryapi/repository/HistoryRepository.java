package com.infogomes.historycountryapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.infogomes.historycountryapi.entity.History;

@Repository
public interface HistoryRepository extends MongoRepository<History, Long> {

}
