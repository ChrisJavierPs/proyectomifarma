package com.mifarma.proyecto.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mifarma.proyecto.modelo.Cliente;
import com.mifarma.proyecto.repository.ClienteRepositorio;
import com.mifarma.proyecto.servicio.ClienteService;


@Service
public class ClienteServiceImpl implements ClienteService {
  
	@Autowired
	private ClienteRepositorio repositorio;
	
	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}


	@Override
	public Cliente add(Cliente c) {
		// TODO Auto-generated method stub
		return repositorio.save(c);
	}

}
