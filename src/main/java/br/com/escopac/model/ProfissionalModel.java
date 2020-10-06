package br.com.escopac.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.escopac.model.Auditable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "profissional")
public class ProfissionalModel extends Auditable implements Serializable{

	private static final long serialVersionUID = -633388036443945186L;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "cpf")
	private String cpf;
}
