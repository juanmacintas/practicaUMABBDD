package org.uma.data.ingestion.repository;

import org.springframework.data.repository.CrudRepository;
import org.uma.data.ingestion.entity.Raw;

public interface RawRepository extends CrudRepository <Raw, Integer> {

}