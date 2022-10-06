package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritmo17 {
	
	Scanner sc = new Scanner(System.in);
	
	public void resultado() {
		System.out.println("Algoritmo17");
		System.out.println("Entrar com a base e a altura de um retângulo e imprimir a seguinte saida: Perímetro, Área e Diagonal");
		double base, altura, perimetro, area, diagonal;
		System.out.println("Informe a Base: ");
		base = sc.nextDouble();
		System.out.println("Informe a Altura: ");
		altura = sc.nextDouble();
		
		area = base * altura;
		
		perimetro = 2 *(base + altura);
		
		double teoremaP = Math.pow(altura, 2) + Math.pow(base, 2);
		diagonal = Math.sqrt(teoremaP);
		
		System.out.println("\nResultado: ");
		System.out.println();
		System.out.println("Perímetro: " + perimetro);
		System.out.println("Area: " + area);
		System.out.println("Diagonal: " + diagonal);
		}

}
