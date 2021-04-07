package epi.api.controllers;


import java.util.ArrayList;

import org.springframework.http.StreamingHttpOutputMessage.Body;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import epi.api.models.alunoModels;

@RestController
public class AlunoController {
		private ArrayList<alunoModels> aluno = new ArrayList<>();
		
		@GetMapping("alunos")
		public ArrayList<alunoModels> getAll()
		{
			return aluno;
		}
		
		@GetMapping("alunos/{matricula}")
		public alunoModels getById(@PathVariable int matricula)
		{
			alunoModels response = null;
			for(alunoModels aluno : aluno)
			{
				if(aluno.getMatricula() == matricula)
				response = aluno;
			}
			return response;
		}
		
		@PostMapping("alunos")
		public alunoModels cadastrarAluno(@RequestBody alunoModels novoAluno)
		{
			this.aluno.add(novoAluno);
			return novoAluno;
		}
		
		@PatchMapping("alunos/{matricula}")
		public alunoModels update( @RequestBody alunoModels novoAluno, @PathVariable int matricula ) {
			alunoModels response = null;
			
			for (alunoModels aluno : aluno) {
				if (aluno.getMatricula() == matricula) {
					
					aluno.setMatricula(novoAluno.getMatricula());
					aluno.setNome(novoAluno.getNome());
					response = novoAluno;
				}
			}
			return response;
		}
		
		@DeleteMapping("alunos/{matricula}")
		public void deleteAluno(@PathVariable int matricula) 
		{
			for(int i = 0 ; i< aluno.size(); i++)
			{
				if(aluno.get(i).getMatricula() == matricula)
				{
					aluno.remove(i);
				}
			}
		}
}
