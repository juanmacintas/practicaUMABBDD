package org.uma.data.ingestion.entity;


import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Label {

	@Id
	private String id;

	private Integer datasetId;

	private Integer cycleId;

	private Integer cleanId;

	private Integer categoryId;
}
