package org.uma.data.ingestion.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.uma.data.ingestion.entity.Clean;

public interface CleanRepository extends MongoRepository<Clean, Integer> {

}