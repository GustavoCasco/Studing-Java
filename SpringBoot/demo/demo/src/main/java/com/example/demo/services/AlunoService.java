package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.demo.Models.AlunoModel;

@Service
public class AlunoService {
	
	public AlunoModel findByMatricula(ArrayList<AlunoModel> alunos, int matricula)
	{
		AlunoModel response = null;
		for(AlunoModel aluno : alunos)
		{
			if(aluno.getMatricula() == matricula)
			response = aluno;
		}
		return response;
	}
	
}
