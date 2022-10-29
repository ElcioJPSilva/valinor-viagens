package com.cadastro.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.http.HttpStatus;

@Entity
@Table (name="cliente")
public class Valinor_viagens {


	//VARIÁVEIS
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id_cliente;
	
	@Column (name = "Nome", nullable = false) 
	private String nome;
	
	@Column (name = "CPF", nullable = false)
	private String cpf;
	
	@Column (name = "Telefone")
	private String telefone;

	public long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_cliente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valinor_viagens other = (Valinor_viagens) obj;
		return id_cliente == other.id_cliente;
	}

	@Override
	public String toString() {
		return "Valinor_viagens [id_cliente=" + id_cliente + ", nome=" + nome + ", cpf=" + cpf + ", telefone="
				+ telefone + "]";
	}
	
	
}
