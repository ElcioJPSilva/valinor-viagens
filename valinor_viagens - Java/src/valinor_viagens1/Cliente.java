package valinor_viagens1;

public class Cliente {
	public int id_cliente;
	public String nome;
	public String cpf;
	public String endereco;
	public String telefone;
	
public Cliente (int id_cliente, String nome, String cpf, String endereco, String telefone) {
		this.id_cliente = id_cliente;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
	}

public Cliente() {
	}

public void exibir() {
		System.out.println("id_cliente: " + id_cliente +"nome: " + nome +"cpf: " + cpf +"endereco " + endereco +"telefone: " + telefone); 
	}

public int getId_cliente() {
	return id_cliente;
}

public void setId_cliente(int id_cliente) {
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

public String getEndereco() {
	return endereco;
}

public void setEndereco(String endereco) {
	this.endereco = endereco;
}

public String getTelefone() {
	return telefone;
}

public void setTelefone(String telefone) {
	this.telefone = telefone;
}


}
