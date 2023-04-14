package controle;

import java.util.Scanner;

public class IfElseIf {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digita a nota: ");
		double nota = sc.nextDouble();
		
		if (nota > 100 || nota < 0) {
			System.out.println("Nota inválida");
		} else if (nota >= 80.1) {
			System.out.println("Conceito A");
		} else if (nota >= 60.1) {
			System.out.println("Conceito B");
		} else if (nota >= 40.1) {
			System.out.println("Conceito C");
		} else if (nota >= 20.1) {
			System.out.println("Conceito D");
		} else {
			System.out.println("Conceito E");
		}
		
		System.out.println("Fim!");
		
		sc.close();
	}

}
