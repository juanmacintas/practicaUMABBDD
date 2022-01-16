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
public class Permission {

	@Id
	private Integer id;

	private String name;

	@OneToMany(mappedBy="permission")
	private List<Users> users;
}
