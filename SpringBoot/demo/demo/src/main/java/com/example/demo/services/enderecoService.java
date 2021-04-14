package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.AlunoModel;
import com.example.demo.Models.enderecoModel;
import com.example.demo.dtos.enderecoDTO;
import com.example.demo.repositories.enderecoRepository;

@Service
public class enderecoService {
	@Autowired
	private enderecoRepository enderecoResp;
	
	public List<enderecoDTO> getAll ()
	{
		List<enderecoModel> endere = this.enderecoResp.findAll();
		
		return endere.stream().map(c -> c.toDto()).collect(Collectors.toCollection(ArrayList::new));
	}
	
	public enderecoDTO getById (int id)
	{
		return enderecoResp.findById(id).orElseThrow(() -> new RuntimeException("Endereço não localizado")).toDto();
	}
	
	public enderecoDTO cadastrarEnderco (enderecoModel novoEndereco)
	{
		return this.enderecoResp.save(novoEndereco).toDto();
	}
	
	public enderecoDTO updEndereco (int id, enderecoModel attEndereco)
	{
		Optional<enderecoModel> enderecoObj = this.enderecoResp.findById(id);
		if(enderecoObj.isPresent())
		{
			enderecoModel end = enderecoObj.get();
			end.setBairro(attEndereco.getBairro());
			end.setCep(attEndereco.getCep());
			end.setLogradouro(attEndereco.getLogradouro());
			return this.enderecoResp.save(end).toDto();
		}
		else {
			throw new RuntimeException("Endereço não encontrado");
		}
	}
	
	public void deleteEndereco(int id)
	{
		this.enderecoResp.deleteById(id);
	}
}
