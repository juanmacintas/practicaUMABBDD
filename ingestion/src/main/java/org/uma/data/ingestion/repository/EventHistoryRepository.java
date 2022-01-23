package org.uma.data.ingestion.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.uma.data.ingestion.entity.EventHistory;

public interface EventHistoryRepository extends MongoRepository<EventHistory, String> {
    
}
