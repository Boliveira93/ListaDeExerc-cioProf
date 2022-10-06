package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritmo16 {
	
	Scanner sc = new Scanner(System.in);
	
	public void resultado() {
		String nome;
		int tamNome, indice;
		System.out.println("Algoritmo16");
		System.out.println("Entrar com um nome e imprimir: Todo nome, Primeiro caractere, Ultimo caractere, todos menos o primeiro, Os dois últimos");
		do {
		System.out.println("Informe um nome: ");
		nome = sc.nextLine();
		tamNome = nome.length();
		if(nome.length() < 4){
			System.out.println("Informe um nome que contenha 4 letras ou mais!");
			
		}
		}while(nome.length() < 4);
		System.out.println("\nResultado: ");
		System.out.println();
		
		if(nome.length() >=4) {
			System.out.println("Todo nome: " + nome);
			System.out.println("Primeiro Caractere: "+ nome.charAt(0));
			System.out.println("Ultimo Caractere: " + nome.charAt(tamNome - 1));
			System.out.println("Do primeiro até o terceiro: ");
			for(indice = 0; indice < 3; indice++) {
				System.out.println(nome.charAt(indice));
			}
			System.out.println("nQuarto caractere: " + nome.charAt(3));
			System.out.println("Todos menos o primeiro: ");
			for(indice = 1; indice < tamNome; indice++) {
				System.out.println(indice);
			}
			System.out.println("\nOs Dois ultimos: " + nome.charAt(tamNome - 2) + "" + nome.charAt(tamNome -1));
		}
	}

}
