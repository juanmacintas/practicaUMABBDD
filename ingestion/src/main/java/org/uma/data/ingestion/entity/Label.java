package org.uma.data.ingestion.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Label {

	@Id
	private Integer id;

	private Integer datasetId;

	private Integer cycleId;

	private Integer cleanId;

	private Integer categoryId;
}
