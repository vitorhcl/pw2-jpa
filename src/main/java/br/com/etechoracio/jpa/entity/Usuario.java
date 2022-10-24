package br.com.etechoracio.jpa.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.*;

import lombok.*;
@Builder
@Getter
@Setter
@Entity
@Table (name = "TBL_USUARIO")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_USUARIO")
	private long id;
	@Column(name = "TX_NOME")
	private String nome;
	@Column(name = "TX_SENHA")
	private String senha;
	@Column(name = "DT_INATIVACAO")
	private LocalDateTime dataInativacao;
	@ManyToMany
	@JoinTable (name = "TBL_REL_USUARIO_GRUPO", 
	joinColumns = @JoinColumn(name = "ID_USUARIO"),
	inverseJoinColumns = @JoinColumn(name = "ID_GRUPO_USUARIO"))
	private List <GrupoUsuario> grupos;
}
