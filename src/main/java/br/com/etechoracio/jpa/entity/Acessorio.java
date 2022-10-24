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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ACESSORIO")
	private long id;

	@Column(name = "TX_DESCRICAO")
	private String descricao;
	
}
