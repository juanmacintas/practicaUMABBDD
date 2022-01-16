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
public class Rol {

	@Id
	private Integer id;

	private String name;

   @OneToMany(mappedBy="rol")
    private List<Users> users;
}
