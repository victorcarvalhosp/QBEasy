package br.com.boilerplate.qbeasy.test.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.boilerplate.qbeasy.model.interfaces.IdentifiableBySerial;

@Entity
@Table(name="usuario")
public class Usuario implements IdentifiableBySerial{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(nullable=false)
	private String email;
	@Column(nullable=false)
	private String senha;
	
	@OneToMany(mappedBy="usuario")
	private List<Recurso> recursos;

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public List<Recurso> getRecursos() {
		return recursos;
	}
	public void setRecursos(List<Recurso> recursos) {
		this.recursos = recursos;
	}
}
