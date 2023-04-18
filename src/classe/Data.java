package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	public Data() {
		// dia = 1;
		// mes = 1;
		// ano = 1900;
		this(1, 1, 1900);
		
		
		// Valores padr�o primitivos
		// byte, short, int, long -> 0
		// float, double -> 0.0
		// boolean -> false
		// char -> '\u0000'
		// objetos -> null
	}

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	String obterDataFormatada() {
		final String formato = "%d/%d/%d";
		return String.format(formato, this.dia, mes, ano);
	}
	
	//N�o � t�o usual para as aplica��es.
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}

}
