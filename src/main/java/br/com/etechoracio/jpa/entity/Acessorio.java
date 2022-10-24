package br.com.etechoracio.jpa.entity;

import javax.persistence.* ;

import lombok.*;

@Builder
@Getter
@Setter
@Entity
@Table(name = "TBL_ACESSORIO")
public class Acessorio {
	@Id 
	@Column(name = "ID_ACESSORIO")
	private long id;

	@Column(name = "TX_DESCRICAO")
	private String descricao;
	
}
