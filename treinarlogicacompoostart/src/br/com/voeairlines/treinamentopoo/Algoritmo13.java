package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritmo13 {
	
	Scanner sc = new Scanner(System.in);
	
	public void resultado() {
		System.out.println("Algoritmo13");
		System.out.println("Entrar com quatro números e imprimir a média ponderada, sabendo-se que os pesos são respctivamente 1,2,3 e 4");
		System.out.println("Digite um valor: ");
		double num1 = sc.nextDouble();
		System.out.println("Digite um segundo valor: ");
		double num2 = sc.nextDouble();
		System.out.println("Digite um terceiro valor: ");
		double num3 = sc.nextDouble();
		System.out.println("Digite um quarto valor: ");
		double num4 = sc.nextDouble();
		double media = (num1 * 1) + (num2 * 2) + (num3 * 3) + (num4 *4);
		System.out.println("\nResultado: ");
		System.out.println("Média: " + media);
	}

}
