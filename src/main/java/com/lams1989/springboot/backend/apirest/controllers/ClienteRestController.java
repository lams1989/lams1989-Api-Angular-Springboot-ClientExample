package com.lams1989.springboot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lams1989.springboot.backend.apirest.models.entity.Cliente;
import com.lams1989.springboot.backend.apirest.models.services.IClienteService;


@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ClienteRestController {
//crea metodo index para enlistar clientes
	
	@Autowired
	private IClienteService clienteService;
		
	@GetMapping("/clientes")
		public List<Cliente> index(){
			return clienteService.findAll();
			
		}
}
