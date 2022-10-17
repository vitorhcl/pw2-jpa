package br.com.etechoracio.jpa.entity;

import javax.persistence.*;

import br.com.etechoracio.jpa.enums.StatusAgenteEnum;
import br.com.etechoracio.jpa.enums.TipoAgenteEnum;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "TBL_AGENTE_AUTUADOR")
public class AgenteAutuador {
	
	@Id
	@Column(name = "ID_AGENTE_AUTUADOR")
	private Long id;
	
	@Column(name = "TX_NOME")
	private String nome;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "TP_AGENTE")
	private StatusAgenteEnum status;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "ST_AGENTE")
	private TipoAgenteEnum tipo;

	@Column(name = "TX_FONE")
	private String telefone;
}
