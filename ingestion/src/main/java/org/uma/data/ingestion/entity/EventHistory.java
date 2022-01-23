package org.uma.data.ingestion.entity;

import java.sql.Date;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EventHistory {

	@Id
	private String id;

	private Integer datasetId;

	private Date startDate;

	private Date lastModified;

	private Date endDate;

	private String status;

	private Event event;

}
