package br.com.projetofinal.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.beans.Artista;
import br.com.projetofinal.dao.ArtistaDAO;
@CrossOrigin("*")
@RestController
public class ArtistaController {

	@Autowired
	private ArtistaDAO dao;
	
	//traz todos artistas
	@GetMapping("/artistas")
	public ResponseEntity<ArrayList<Artista>> getAll(){
		ArrayList<Artista> lista = (ArrayList<Artista>) dao.findAll();
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}
	
	
	//traz artista por id
	@GetMapping("/artista/{id}")
	public ResponseEntity<Artista> getArtista(@PathVariable int id)
		{
		Artista resp = dao.findById(id).orElse(null);
		if(resp == null) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(resp);
		
	}
	
	
	@PostMapping("/nacionalidade")
	public ResponseEntity<ArrayList<Artista>> nacionalidade(@RequestBody Artista nacional)
	{
	ArrayList<Artista> nacao = dao.findByNacionalidade(nacional.getNacionalidade());
	
	if(nacao == null) {
		return ResponseEntity.status(404).build();
	}
	return ResponseEntity.ok(nacao);
	
	}
	
	@PostMapping("/novoartista")
	public ResponseEntity<Artista> gravar(@RequestBody Artista novo)
	{
	
			dao.save(novo);
			return ResponseEntity.ok(novo);
	
			
		}
		
		
	}
	
	

