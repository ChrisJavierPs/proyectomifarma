package com.mifarma.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mifarma.proyecto.modelo.Cliente;
import com.mifarma.proyecto.servicio.ClienteService;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/clientes"})
public class ClienteController {

     @Autowired
     ClienteService service;
     
     
     @GetMapping
     public List<Cliente> listar(){
    	 
    	 
    	 return service.listar();
     }
     
     @PostMapping
     public Cliente agregar(@RequestBody Cliente c){
    	 
    	
    	 return service.add(c);
     }
     
     @RequestMapping("/inicio")
     public String inicio(){
    	 
    	 return "<h3>Hola que tal</h3>";
     }
}
