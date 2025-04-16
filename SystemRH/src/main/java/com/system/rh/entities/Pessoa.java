package com.system.rh.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pessoa")
public class Pessoa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY) // Se você estiver usando um banco de dados que suporta auto incremento
	private long id;
	private String name;
	private String documento; // validar se é melhor ser string ou ser long sem mascara
	private String telefone;
	private String email;
	private Date dataNascimento;
	private String sexo; // Pode ser "M", "F" ou outro valor

	
	@OneToMany(mappedBy = "pessoa")
	@JsonIgnore
	private List<Endereco> enderecos;

	@OneToOne(mappedBy = "pessoa")
	private Usuario usuario; 

	public Pessoa () {}

	public Pessoa(long id, String name, String documento, String telefone, String email, Date dataNascimento,
			String sexo, Usuario usuario) {
		super();
		this.id = id;
		this.name = name;
		this.documento = documento;
		this.telefone = telefone;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;

		this.usuario = usuario;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return id == other.id;
	}
}
