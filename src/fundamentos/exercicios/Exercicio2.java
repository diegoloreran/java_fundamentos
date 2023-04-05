package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio2 {
	
	/* Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius. */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor em Fahrenheit: ");
		double fahrenheit = sc.nextDouble();
		
		double conversao = (fahrenheit - 32) / 1.8;
		
		System.out.println("Valor em Celsius: " + conversao + "ºC");
		
		
		sc.close();
	}

}
