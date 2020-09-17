package br.com.projetofinal.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.projetofinal.beans.Usuario;
//cadastra como filha de CrudRepository <nome da classe, tipo de dado da PK

public interface UsuarioDAO extends CrudRepository<Usuario, Integer> {
	
	/*
	 * DAO => DATA ACCESS OBJECT é um design pattern, que sugestiona 
	 * a criação do CRUD  dentro desta classe
	 * Create Read Update Delete
	 * nome do metodo precisa segur o padrao do spring boot
	 * findBy = smper vai criar os metodos de acordo com o atributo nao com o BD
	 */
	
	Usuario findByEmailAndSenha(String em, String se);
	

}
