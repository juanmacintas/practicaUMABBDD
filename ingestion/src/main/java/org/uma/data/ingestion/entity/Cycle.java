package org.uma.data.ingestion.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cycle {

	@Id
	private Integer id;

	private Integer datasetId;

	private Integer iteration;

	private Boolean lastCycle;

	@OneToMany(mappedBy="cycle")
	private List<EventHistory> history;

	@OneToMany(mappedBy="cycle")
	private List<Categorization> cateorization;
}
