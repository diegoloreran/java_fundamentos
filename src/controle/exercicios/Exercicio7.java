package controle.exercicios;

import java.util.Scanner;

public class Exercicio7 {
	
	 /*
	  * Criar um programa que enquanto estiver recebendo números positivos,
	  * imprime no console a soma dos números inseridos, caso receba um número
	  * negativo, encerre o programa. Tente utilizar a estrutura do while.
	  */
	
	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
		
		int somadorDeNumeros = 0;
		int numero = 0;
		
		while (numero >= 0) {
			System.out.println("Digite um número inteiro (ou negativo para sair): ");
			numero = entrada.nextInt();
			if (numero >= 0) {
				somadorDeNumeros += numero; // Isso é igual somadorDeNumeros = somadorDeNumeros + numero;
				System.out.printf("Soma até o momento: %d\n", somadorDeNumeros);
			}
		}	
		entrada.close();
	}
}