package com.ifce.musica.Musicas.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ifce.musica.Musicas.model.Musica;

@Controller
public class MusicaController {
	
	@GetMapping("/cadastroMusica")
	public String formCadastroMusica(Model model) {
		Musica musica = new Musica();
		model.addAttribute("musica", musica);
		return "cadastromusica";
	}
	
	@PostMapping("/cadastroMusica")
	public String recebeMusica(
			@ModelAttribute("musica") Musica musica, 
			Model model
			) {
		
		ArrayList<Musica> lista = new ArrayList<>();
		
		Musica musica1 = new Musica("m1","2m20s","estilo1");
		Musica musica2 = new Musica("m2","2m40s","estilo1");
	
		lista.add(musica1);
		lista.add(musica2);
		
		lista.add(musica);
		
		model.addAttribute("lista", lista);
		return "relatorio";
	}
	
	
	
	
	
	
	
	

}
