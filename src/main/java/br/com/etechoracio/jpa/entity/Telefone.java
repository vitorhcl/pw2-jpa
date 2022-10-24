package br.com.etechoracio.jpa.entity;

import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "TBL_TELEFONE")
public class Telefone {
	@Id
	@Column(name = "ID_TELEFONE")
	private Long id;
	
	@Column(name = "TX_AREA")
	private String area;
	
	@Column(name = "TX_NUMERO")
	private String numero;
}
