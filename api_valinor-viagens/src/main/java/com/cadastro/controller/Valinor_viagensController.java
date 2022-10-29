package com.cadastro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastro.model.Valinor_viagens;
import com.cadastro.serviceImpl.Valinor_viagensServiceImpl;

@RestController
@RequestMapping ("api/clientes")
public class Valinor_viagensController {

	@Autowired
	private Valinor_viagensServiceImpl service;
	
	//REQUEST TESTE
	@GetMapping ("/home")
	public String hello () {
		return "oi";
	}
	
	//REQUEST LISTAGEM
	//localhost:8080/api/clientes
	@GetMapping
	public ResponseEntity<List<Valinor_viagens>> findAll () {
		List<Valinor_viagens> cliente = service.getAllClientes();
		return ResponseEntity.ok().body(cliente);
	}
	
	//REQUEST POR ID
	//localhost:8080/api/clientes/1
	@GetMapping("{id}")
	public ResponseEntity<Valinor_viagens> getValinor_viagensById(@PathVariable("id") long ClienteId) {
		return new ResponseEntity<Valinor_viagens>(service.getClienteById(ClienteId), HttpStatus.OK);	
	}
	
	//REQUEST PARA SALVAR
	//localhost:8080/api/clientes 
	@PostMapping
	public ResponseEntity<Valinor_viagens> saveValinor_viagens (@RequestBody Valinor_viagens cliente) {
		return new ResponseEntity <Valinor_viagens>(service.saveValinor_viagens (cliente), HttpStatus.CREATED);
	}

	//REQUEST PARA ATUALIZAR
	//localhost:8080/api/clientes/1
	@PutMapping ("{id}")
	public ResponseEntity<Valinor_viagens> updateValinor_viagens (@PathVariable("id") long id, 
			 @RequestBody Valinor_viagens cliente) {
		return new ResponseEntity <Valinor_viagens>(service.updateValinor_viagens (cliente, id), HttpStatus.OK);
	}
	
	//REQUEST PARA DELETAR
	//localhost:8080/api/clientes
	@DeleteMapping ("{id}")
	public ResponseEntity<String> deleteValinor_viagens (@PathVariable("id") long id){
		service.deleteCliente(id);
		return new ResponseEntity<String>("Cliente deletado com sucesso!", HttpStatus.OK);
	}
		
}
	
	
