package br.com.etechoracio.jpa.entity;

import java.time.LocalDateTime;

import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@Entity
@Table (name = "TBL_GRUPO_USUARIO")
public class GrupoUsuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_GRUPO_USUARIO")
	private long id;
	
	@Column(name = "TX_NOME")
	private String nome;
	
	@Column(name = "DT_INICIO_VIGENCIA")
	private LocalDateTime dataInicioVigencia;
	
	@Column(name = "DT_FIM_VIGENCIA")
	private LocalDateTime dataFimVigencia;
}
