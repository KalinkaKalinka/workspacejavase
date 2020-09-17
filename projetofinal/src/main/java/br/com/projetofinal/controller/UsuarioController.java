package br.com.projetofinal.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.beans.Usuario;
import br.com.projetofinal.dao.UsuarioDAO;

//essa annotation é a que indica que essa classe é uma controller
//controller é responsavel por levar os items para o BD e vice versa
@RestController
public class UsuarioController {

	@Autowired //importo os metodos do Spring boot, que serao utilizados pelo DAO
	//aqui eu delego para os metodos definidos no SPring boot
	private UsuarioDAO dao; //atributo do tipo DAO
	
	@PostMapping("/login") // dado vem pelo corpo do protocolo
	public ResponseEntity<Usuario> logar(@RequestBody Usuario user) //requestbody capta usuario e senha do html
	{
		Usuario resposta = dao.findByEmailAndSenha(user.getEmail(), user.getSenha());
		
		if (resposta ==null) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(resposta);
	}
	
	//esse metodo serve para trazer um objeto da tabela com base no ID selecionado
	//busca na tabela a chave primaria(id) que atribui como variavel
	
	@GetMapping("/usuario/{codigo}") //variavel entre {}
	public ResponseEntity<Usuario> getUsuario(@PathVariable int codigo){
		Usuario resposta = dao.findById(codigo).orElse(null);
		if (resposta == null) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(resposta);
	}
	
	
	@GetMapping("/usuarios") //essa e a URL que vou usar para chamar o metodo
	public ResponseEntity<ArrayList<Usuario>> getAll(){
		ArrayList <Usuario> lista = (ArrayList<Usuario>) dao.findAll();
		//dao.findAll() só traz uma lista do bd, mas associar a uma variavel ele traz e preenche a variavel
		//(ArrayList<Usuario>) - cast de iterable para arraylist
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
		//para chamar esse metodo sera necessario associar ele a uma URL
		//ResponseEntity serve para chamar mensagens de erro de http
	}
	 
	
	
}
