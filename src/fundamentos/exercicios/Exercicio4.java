package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio4 {
	/*Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor: ");
		double valor = sc.nextDouble();
		
		/* Existe também a possibilidade
		 * double quadrado = valor * valor;
		 * double cubo = valor * valor * valor;
		 */
		
		double quadrado = Math.pow(valor, 2);
		double cubo = Math.pow(valor, 3);
		
		System.out.print("O valor ao quadrado é: " + quadrado + "\nO valor ao cubo é: " + cubo);
		 
		sc.close();
	}

}
