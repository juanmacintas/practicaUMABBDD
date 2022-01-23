package org.uma.data.ingestion.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.uma.data.ingestion.entity.Users;

public interface UsersRepository extends MongoRepository<Users, String> {
    
}
