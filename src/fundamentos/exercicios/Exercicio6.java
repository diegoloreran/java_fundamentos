package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio6 {
	
	/*Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0).
	 *utilizando a fórmula de Bhaskara. 
	 *Use como exemplo a = 1, b = 12 e c = -13. 
	 *Encontre o delta
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Equação: ax² + bx + c = 0");
		
		System.out.print("Digite o valor de A: ");
		int a = sc.nextInt();
		
		System.out.print("Digite o valor de B: ");
		int b = sc.nextInt();
		
		System.out.print("Digite o valor de C: ");
		int c = sc.nextInt();
		
		int delta = (b * b) - (4 * a * c);
		
		System.out.printf("\nSua equação é: %dx² + %dx + %d = 0", a, b, c);
		
		System.out.print("\no delta é: " + delta);
		double x1 = (-b + Math.sqrt(delta) / (2 * a));
		
		System.out.printf("\nO x1 da equação é: %.2f", x1);
		double x2 = (-b - Math.sqrt(delta) / (2 * a));
		
		System.out.printf("\nO x2 da equação é: %.2f", x2);
		
		sc.close();
	}
}