package com.enviro.assesment.grad001.jadamathele.domain;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Entity
@Table(name = "waste_data")
@Getter
@Setter
public class WasteData {
	@Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;
	private String year;
	private String recyclables;
	private String organics;
	private String buildersRubble;
	
	public WasteData() {}
}