package org.uma.data.ingestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uma.data.ingestion.entity.Raw;

public interface RawRepository extends JpaRepository<Raw, Integer> {

}