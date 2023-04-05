package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio3 {
	
	/*Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu peso: ");
		double peso = sc.nextDouble();
		
		System.out.print("Digite sua altura: ");
		double altura = sc.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.printf("IMC: %.2f", imc);
		
		sc.close();
	}


}
