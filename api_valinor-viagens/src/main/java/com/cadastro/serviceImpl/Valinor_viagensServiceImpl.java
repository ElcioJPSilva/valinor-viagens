package com.cadastro.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cadastro.exception.ResourceNotFoundException;
import com.cadastro.model.Valinor_viagens;
import com.cadastro.repositories.Valinor_viagensRepository;
import com.cadastro.service.Valinor_viagensService;

@Service
public class Valinor_viagensServiceImpl implements Valinor_viagensService{
	
	@Autowired	
	private Valinor_viagensRepository clienteRepository;
	
	@Override 
	public Valinor_viagens saveValinor_viagens (Valinor_viagens cliente) {
		return clienteRepository.save(cliente);
	}
	
	@Override	
	public List<Valinor_viagens> getAllClientes() {
		return clienteRepository.findAll();
	}

	@Override
	public Valinor_viagens getClienteById (long id_cliente) {
		return clienteRepository.findById(id_cliente).orElseThrow(() ->
				new ResourceNotFoundException("Clientes", "id_cliente", id_cliente));
	}
	
	@Override
	public Valinor_viagens updateValinor_viagens (Valinor_viagens cliente, long id_cliente) {
		
		Valinor_viagens clienteExistente = clienteRepository.findById(id_cliente).orElseThrow(
				() -> new ResourceNotFoundException("Clientes", "id_cliente", id_cliente));
		
		clienteExistente.setNome(cliente.getNome());
		clienteExistente.setCpf(cliente.getCpf());
		clienteExistente.setTelefone(cliente.getTelefone());
		
		clienteRepository.save(clienteExistente);
		return clienteExistente;
	}
	
	@Override
	public void deleteCliente (long id_cliente) {
		clienteRepository.findById(id_cliente).orElseThrow(() ->
				new ResourceNotFoundException("Clientes", "id_cliente", id_cliente));
		
		clienteRepository.deleteById(id_cliente);
	}
}