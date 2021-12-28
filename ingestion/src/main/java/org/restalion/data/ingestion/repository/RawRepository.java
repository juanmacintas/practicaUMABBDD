package org.restalion.data.ingestion.repository;

import org.restalion.data.ingestion.entities.Raw;
import org.springframework.data.repository.CrudRepository;

public interface RawRepository extends CrudRepository <Raw, Integer> {

}