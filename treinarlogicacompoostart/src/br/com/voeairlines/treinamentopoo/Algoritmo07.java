package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritmo07 {
	
	Scanner sc = new Scanner(System.in);
	
	public void resultado() {
		System.out.println("Algoritmo07");
		System.out.println("Ler um numero inteiro e escrever o seu sucessor e seu antecessor");
		System.out.println("Digite um número: ");
		int num = sc.nextInt();
		int sucessor = num + 1;
		int antecessor = num - 1;
		System.out.println("\nResultado: ");
		System.out.println("Número Digitado: " + num);
		System.out.println("Número Digitado: " + sucessor);
		System.out.println("Número Digitado: " + antecessor);
		
	}

}
