package controle.exercicios;

import java.util.Scanner;

/**
	 * Criar um programa que receba um número e diga se ele é um número primo.
	 */

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		int contadorDeDivisores = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nDigite um número para verificar se é primo: ");
		int numero = sc.nextInt();
		
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}
		
		if (contadorDeDivisores == 0) {
			System.out.println("\nO número " + numero + " é primo.");
		} else {
			System.out.println("\nO número " + numero + " não é primo.");
		}
		sc.close();
	}
}