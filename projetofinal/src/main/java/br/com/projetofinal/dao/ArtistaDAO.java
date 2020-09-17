package br.com.projetofinal.dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.com.projetofinal.beans.Artista;


public interface ArtistaDAO extends CrudRepository<Artista, Integer> {
	
	ArrayList<Artista> findByNacionalidade(String nacionalidade);
	

	

}
