package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.escolaModel;
import com.example.demo.dtos.escolaDTO;
import com.example.demo.repositories.escolaRespository;

@Service
public class escolaService {
	@Autowired
	private escolaRespository escolaresp;
	
	public List<escolaDTO> getAll ()
	{
		List<escolaModel> list = this.escolaresp.findAll();
		return list.stream().map(e -> e.toDto()).collect(Collectors.toCollection(ArrayList::new));
	}
	
	public escolaDTO getById (int id)
	{
		return this.escolaresp.findById(id).orElseThrow(() -> new RuntimeException ("Escola não encontrada")).toDto();
	}
	
	public escolaDTO addEscola (escolaModel novaEscola)
	{
		return this.escolaresp.save(novaEscola).toDto();
	}
	
	public escolaDTO updateEscola (escolaModel attEscola, int id)
	{
		
		Optional<escolaModel> escolaObj = this.escolaresp.findById(id);
		if(escolaObj.isPresent())
		{	
			escolaModel school = escolaObj.get();
			school.setNome(attEscola.getNome());
			school.setNumero_salas(attEscola.getNumero_salas());
			return this.escolaresp.save(school).toDto();
		}
		else {
			throw new RuntimeException("Escola não encontrada");
		}
	}
	
	public void deleteEscola (int id)
	{
		escolaresp.deleteById(id);
	}
}
