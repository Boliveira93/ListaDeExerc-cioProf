package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritmo09 {
	Scanner sc = new Scanner(System.in);
	
	public void resultado() {
		System.out.println("Algoritmo09");
		System.out.println("Ler dois números inteiros e imprimir a soma.Antes do resultado, deverá aparecer a mensagem soma");
		System.out.println("Digite o 1º Número: ");
		int num1 = sc.nextInt();
		System.out.println("Digite o 2º Número: ");
		int num2 = sc.nextInt();
		int soma = num1 + num2;
		System.out.println("\nResultado: ");
		System.out.println("A Soma dos Números é: " + soma);
	}

}
