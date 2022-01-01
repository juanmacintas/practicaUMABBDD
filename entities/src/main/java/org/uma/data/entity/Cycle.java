package org.uma.data.entity;

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
public class Cycle {

	@Id
	private Integer id;

	private Integer datasetId;

	private Integer iteration;

	private Boolean lastCycle;

}
