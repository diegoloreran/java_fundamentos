package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio1 {
	
/* Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Celsius: ");
		double celsius = sc.nextDouble();
		
		double conversao = celsius * 9 / 5 + 32;
		
		System.out.println("Valor em Fahrenheit: " + conversao + "ºF");
		
		sc.close();
		
	}

}
