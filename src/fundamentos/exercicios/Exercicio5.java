package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio5 {
	
	/*Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a base: ");
		double base = sc.nextDouble();
		
		System.out.print("Digite a altura: ");
		double altura = sc.nextDouble();
		
		double area = (base * altura) / 2;
		System.out.print("A área do triângulo é: " + area);
		
		
		sc.close();
	}


}
