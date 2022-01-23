package org.uma.data.ingestion.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Categorization {

	private Integer datasetId;

	private Integer cleanId;

	private Integer ownerId;

	private Integer priority;

	private Integer defaultCategoryId;

	private Double spend;

	private String vendor;

	private Double threshold;

	private Category category;
}
