package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		// Informações de funcionários
		
		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L; // L = literal long
		
		// Tipos númericos reais
		float salario = 11_445.44F; // F = literal float
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false; // true
		
		// Tipo caractere
		char status = 'A'; // ativo
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Números de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por Real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		System.out.println(id + ": ganha R$" + salario);
		System.out.println("Está de férias? " + estaDeFerias);
		System.out.println("Status " + status);
	}
}