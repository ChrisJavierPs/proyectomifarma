package com.mifarma.proyecto.servicio;

import java.util.List;

import com.mifarma.proyecto.modelo.Cliente;

public interface ClienteService {

	List<Cliente> listar();
	Cliente add(Cliente c);
}
