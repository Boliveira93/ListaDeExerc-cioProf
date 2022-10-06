package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritmo14 {
	
	Scanner sc = new Scanner(System.in);
	
	public void resultado() {
		System.out.println("Algoritmo14");
		System.out.println("Fazer um algoritmo que posso entrar com o saldo de um aplicação e imprima o novo saldo, considerando o reajuste de 1%");
		System.out.println("Digite um valor que deseja aplicar: ");
		double saldo = sc.nextDouble();
		double novoSaldo = saldo + (saldo*00.1);
		System.out.println("\nResultado: ");
		System.out.println("O valor do saldo atualizado é: "+ novoSaldo);
	}

}
