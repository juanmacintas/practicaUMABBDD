package org.uma.data.ingestion.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.uma.data.ingestion.entity.Raw;

public interface RawRepository extends MongoRepository<Raw, Integer> {

}