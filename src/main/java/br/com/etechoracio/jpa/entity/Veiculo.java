package br.com.etechoracio.jpa.entity;

import java.util.List;

import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "TBL_VEICULO")
public class Veiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_VEICULO")
	private Long id;

	@Column(name = "TX_FABRICANTE")
	private String fabricante;

	@Column(name = "TX_MODELO")
	private String modelo;

	@Column(name = "NR_ANO_FABRICACAO")
	private Integer anoFabricacao;

	@Column(name = "NR_ANO_MODELO")
	private Integer anoModelo;

	@Column(name = "VLR_PRECO")
	private Double valor;
	
	@ManyToMany
	@JoinTable(name = "TBL_REL_VEICULO_ACESSORIO", joinColumns = @JoinColumn(name = "id_veiculo"), inverseJoinColumns = @JoinColumn(name = "id_acessorio"))
	private List<Acessorio> acessorio;

	@ManyToOne
	@JoinColumn(name = "ID_PROPRIETARIO")
	private Proprietario proprietario;
}

