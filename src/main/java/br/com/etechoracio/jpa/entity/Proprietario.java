package br.com.etechoracio.jpa.entity;

import javax.persistence.*;

import br.com.etechoracio.jpa.enums.TipoPessoaEnum;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "TBL_PROPRIETARIO")
public class Proprietario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PROPRIETARIO")
	private Long id;
	
	@Column(name = "TX_NOME")
	private String nome;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "TP_PROPRIETARIO")
	private TipoPessoaEnum tipo;
	
	@Column(name = "TX_DOCUMENTO")
	private String documento;
	
	@OneToOne
	@JoinColumn(name = "ID_TELEFONE")
	private Telefone telefone;
}
