package valinor_viagens.aplicacao;

import valinor_viagens.dao.ClienteDAO;
import valinor_viagens1.Cliente;

public class Main {

	public static void main(String[] args) {
		
		ClienteDAO clienteDAO = new ClienteDAO();

		Cliente cliente = new Cliente();
		cliente.setNome("Mariana Barbosa");
		cliente.setCpf("03283376336");
		cliente.setEndereco("Rua Ipiranga");
		cliente.setTelefone("8893737069");
		
		clienteDAO.save(cliente);

	}

}
