package com.system.rh.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_usuario")
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private Pessoa pessoa;

    @NotBlank(message = "O login é obrigatório.")
    @Size(min = 5, max = 50, message = "O login deve ter entre 5 e 50 caracteres.")
    private String login;

    @NotBlank(message = "A senha é obrigatória.")
    @Size(min = 8, max = 20, message = "A senha deve ter entre 8 e 20 caracteres.")
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$", 
             message = "A senha deve conter pelo menos uma letra, um número e um caractere especial.")
    private String senha;

    private String tipoUsuario; 
    private boolean ativo;

    public Usuario() {}

    public Usuario(long id, Pessoa pessoa, String login, String senha, String tipoUsuario, boolean ativo) {
        this.id = id;
        this.pessoa = pessoa;
        this.login = login;
        this.senha = senha;
        this.tipoUsuario = tipoUsuario;
        this.ativo = ativo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;

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
		Usuario other = (Usuario) obj;
		return id == other.id;
	}    
}
