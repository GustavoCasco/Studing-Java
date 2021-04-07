package epi.api.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Para de fato transformar em controller
@RestController

public class primeIroController {
	
	
	//Primeiros GET
	@GetMapping("nome")
	public String minhaPrimeiraMensagem ()
	{
		return "Gustavo";
	}
	
	@GetMapping("as")
	public String getNome ()
	{
		return "Gustavao";
	}
	
	@GetMapping("Array")
	public ArrayList<String> minhaSegundaMensagem()
	{
		ArrayList<String> arra = new ArrayList();
		arra.add("Tudo nosso nada deles");
		arra.add("Versão Brasileira, Hebert Richard");
		return arra;
	}
}
