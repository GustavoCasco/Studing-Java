package com.example.demo.Models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.modelmapper.ModelMapper;

import com.example.demo.dtos.alunoDTO;
import com.example.demo.dtos.enderecoDTO;
import com.example.demo.dtos.escolaDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "escola")
public class escolaModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idescola;
	private String nome;
	private String tipo_escola; 
	private int numero_salas;
	
	@JsonIgnore
	//Essa tabela é chave estrangeeira da tabela aluno
	@OneToMany (mappedBy = "escola")
	private List<AlunoModel> aluno;
	
	public escolaDTO toDto() {
		ModelMapper modelMapper = new ModelMapper();
		
		return modelMapper.map(this, escolaDTO.class);
	}
}




