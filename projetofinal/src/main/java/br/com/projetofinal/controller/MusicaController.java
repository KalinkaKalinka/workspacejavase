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

import br.com.projetofinal.beans.Musica;
import br.com.projetofinal.dao.MusicaDAO;
@CrossOrigin("*")
@RestController
public class MusicaController {
	@Autowired
	private MusicaDAO dao;
	
	@GetMapping("/lancamento/{tipo}")
	public ResponseEntity<ArrayList<Musica>> getLancamento(@PathVariable int tipo)
	{
		ArrayList<Musica> resultado = dao.findByLancamento(tipo);
		if (resultado.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(resultado);
	}
	
	@GetMapping("/musicas")
	public ResponseEntity <ArrayList<Musica>> getAll(){
		ArrayList<Musica> lista = (ArrayList<Musica>) dao.findAll();
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("/musicas/{id}")
	public ResponseEntity <Musica> getMusica(@PathVariable int id) {
		Musica resp = dao.findById(id).orElse(null);
		if(resp == null) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(resp);
	}
	
	@PostMapping("/novamusica")
		
	public ResponseEntity<Musica> gravar (@RequestBody Musica musica){
		try {
			dao.save(musica);
			return ResponseEntity.ok(musica);
		}catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(403).build();
		}
	}
	
	
	

}
