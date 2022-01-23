package org.uma.data.ingestion.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.uma.data.ingestion.entity.Label;

public interface LabelRepository extends MongoRepository<Label, String>{
    
}
