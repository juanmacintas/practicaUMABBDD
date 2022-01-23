package org.uma.data.ingestion.entity;

import java.util.List;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cycle {

	@Id
	private String id;

	private Integer datasetId;

	private Integer iteration;

	private Boolean lastCycle;

	private List<String> history;

	private List<Categorization> cateorization;
}
