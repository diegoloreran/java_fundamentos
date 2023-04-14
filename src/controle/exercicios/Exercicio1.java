package controle.exercicios;

import java.util.Scanner;

public class Exercicio1 {
	
	/**
	 * Criar um programa que receba um número e verifique se ele está entre 0 e
	 * 10 e é par;
	 */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = entrada.nextInt();
		
		if (numero >= 0 && numero <= 100) {
			if (numero % 2 == 0) {
				System.out.print("O número " + numero + " está entre 0 e 100 e é um número par.");
			} else {
				System.out.print("O número " + numero + " está entre 0 e 100 e é um número ímpar.");
			}
		} else {
			System.out.println("O número " + numero + " não está entre 0 e 100.");
		}
		
		entrada.close();
	}
}