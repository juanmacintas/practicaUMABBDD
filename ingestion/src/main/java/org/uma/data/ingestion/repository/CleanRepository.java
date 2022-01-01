package org.uma.data.ingestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uma.data.ingestion.entity.Clean;

public interface CleanRepository extends JpaRepository<Clean, Integer> {

}