package controle.exercicios;

import java.util.Scanner;

public class Exercicio3 {
	
	/**
	 * Criar um programa que receba duas notas parciais, calcular a média
	 * final. Se a nota do aluno for maior ou igual a 7.0 imprime no console
	 * "Aprovado", se a nota for menor que 7.0 e maior do que 4.0 imprime no console
	 * "Recuperação", caso contrário imprime no console "Reprovado".
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if (media >= 7) {
			System.out.println("Sua média foi " + media + " e você está aprovado!");
		} else if (media >= 4) {
			System.out.println("Sua média foi " + media + " e você está em recuperação!");
		} else {
			System.out.println("Sua media foi " + media + " e você está reprovado!");
		}
		sc.close();
	}
}