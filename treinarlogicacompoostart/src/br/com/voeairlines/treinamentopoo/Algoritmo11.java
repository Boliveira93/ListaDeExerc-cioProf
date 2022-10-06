package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritmo11 {
	
	Scanner sc = new Scanner(System.in);
	
	public void resultado() {
		System.out.println("Algoritmo11");
		System.out.println("Ler um número real e imprimir a terça parte deste número.");
		System.out.println("Digite um Número: ");
		double num1 =sc.nextDouble();
		double resultado = num1 /3;
		System.out.println("\nResultado: ");
		System.out.println(resultado);
	}

}
