package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritmo12 {
	
	Scanner sc = new Scanner(System.in);
	
	public void resultado() {
		System.out.println("Algoritmo12");
		System.out.println("Entrar com dois números reais e imprimir a média aritmética com a mensagem media antes do resultado");
		System.out.println("Digite um valor: ");
		double num1 = sc.nextDouble();
		System.out.println("Digite o outro valor: ");
		double num2 = sc.nextDouble();
		double media = (num1+num2) / 2;
		System.out.println("\nResultado: " );
		System.out.println("Média: "+media);
	}

}
