package com.lams1989.springboot.backend.apirest.models.services;

import java.util.List;

import com.lams1989.springboot.backend.apirest.models.entity.Cliente;

public interface IClienteService {

	public List<Cliente> findAll();
}
