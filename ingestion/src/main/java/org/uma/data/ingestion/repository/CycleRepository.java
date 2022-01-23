package org.uma.data.ingestion.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.uma.data.ingestion.entity.Cycle;

public interface CycleRepository extends MongoRepository<Cycle,String> {
    
}
