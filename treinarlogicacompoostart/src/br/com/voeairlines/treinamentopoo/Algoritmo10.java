package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritmo10 {
	
	Scanner sc = new Scanner(System.in);
	
	public void resultado() {
		System.out.println("Algoritmo10");
		System.out.println("Ler dois números inteiros e imprimir o produto.");
		System.out.println("Digite o primeiro número: ");
		int num1 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		int num2 = sc.nextInt();
		int produto = num1*num2;
		System.out.println("\nResultado: ");
		System.out.println(produto);
		
	}
	

}