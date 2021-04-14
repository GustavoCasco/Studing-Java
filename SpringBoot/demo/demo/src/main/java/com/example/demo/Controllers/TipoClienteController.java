package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.demo.Models.*;
import com.example.demo.services.*;

@RestController
public class TipoClienteController {
	
	@Autowired
	private TipoClienteService tipoClienteServ;
		
	@GetMapping("tiposclientes")
	public List<TipoCliente> findAll()
	{
		return this.tipoClienteServ.findAll();	
	}
	
	@GetMapping("tiposclientes/{id}")
	public TipoCliente findById(@PathVariable int id)
	{
		return this.tipoClienteServ.getById(id);
	}
	
	@PostMapping("tiposclientes")
	public TipoCliente create(@RequestBody TipoCliente addNovo)
	{
		return this.tipoClienteServ.Cadastro(addNovo);
	}
	
	@PutMapping("tiposclientes/{id}")
	public TipoCliente updateTipoCliente(@PathVariable int id, @RequestBody TipoCliente addNovo )
	{
		return tipoClienteServ.update(id, addNovo);
	}
	
	@DeleteMapping("tiposclientes/{id}")
	public void deleteTipoCliente(@PathVariable int id)
	{
		tipoClienteServ.delete(id);
	}
}
