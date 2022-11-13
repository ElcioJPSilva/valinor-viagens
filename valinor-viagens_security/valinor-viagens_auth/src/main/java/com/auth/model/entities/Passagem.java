package com.auth.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "passagens")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Passagem {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private Long origem;
	
	private Long destino;
}
