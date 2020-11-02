package br.com.alura.mvc.mudi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NovoLogin {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
}
