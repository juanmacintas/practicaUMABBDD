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
public class Users {

	@Id
	private String id;

	private String userName;

	private String userSurname;

	private String userStatus;

	private String client;

	private List<String> history;

	private Rol rol;

	private Permission permission;

}
