package org.uma.data.ingestion.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Categorization {

	@Id
	private Integer id;

	private Integer datasetId;

	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Cycle cycle;

	private Integer cleanId;

	private Integer ownerId;

	private Integer priority;

	private Integer defaultCategoryId;


	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Category category;

	private Double spend;
	private String vendor;
	private Double threshold;
}
