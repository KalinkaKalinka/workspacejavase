package br.com.banco.implementacao;

import br.com.banco.beans.Conta;

public class AplicacaoConta {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.setNumero(1234);
		conta.setTipo("Corrente");
		conta.setAplicacao(0);
		conta.setLimite(100);
		conta.setSaldo(10000);
		conta.setTitular("Nepomuceno");
		
		conta.sacar(2000);
		System.out.println(conta.getSaldo());
		
		conta.depositar(1000);
		System.out.println(conta.getSaldo());
		
		conta.aplicarAutomatico();
		System.out.println("Saldo: "+ conta.getSaldo());
		System.out.println("Aplicação: " + conta.getAplicacao());
		
		float porcentagem = 10;
		conta.aplicarRendimento(porcentagem);
		System.out.println("Aplicação com rendimento de "+ porcentagem + "% " + conta.getAplicacao());
		
		
		

	}

}
