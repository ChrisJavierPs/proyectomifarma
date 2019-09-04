package com.mifarma.proyecto.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.mifarma.proyecto.modelo.Cliente;

public interface ClienteRepositorio extends Repository<Cliente, Integer> {

	List<Cliente> findAll();
	Cliente save(Cliente c);
}
