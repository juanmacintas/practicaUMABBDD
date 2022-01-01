package org.uma.data.ingestion.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
public class Users {

	@Id
	private Integer id;

	private String userName;

	private String userSurname;

	private String userStatus;

	@ManyToOne
	@JoinColumn(name = "id", insertable = false, updatable = false)
	private Rol rolId;

	@ManyToOne()
	@JoinColumn(name = "id",insertable = false, updatable = false)
	private Permission permissionId;

	private String client;

}
