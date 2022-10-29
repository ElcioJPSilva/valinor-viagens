package com.cadastro.service;

import java.util.List;

import com.cadastro.model.Valinor_viagens;

public interface Valinor_viagensService {
	Valinor_viagens saveValinor_viagens (Valinor_viagens cliente);
	List<Valinor_viagens> getAllClientes();
	Valinor_viagens getClienteById (long id_cliente);
	Valinor_viagens updateValinor_viagens (Valinor_viagens cliente, long id_cliente);
	void deleteCliente (long id_cliente);
}
