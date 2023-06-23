package excecao;

public class ChecadaVsNaoChecada {
	
	public static void main(String[] args) {
		
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim!");
	}
	
	// Exce��o N�O checada ou N�O verificada
	
	static void geraErro1() {
		throw new RuntimeException("Erro #01");
	}
	
	// Exce��o checada ou verificada
	
	static void geraErro2() throws Exception {
		throw new Exception("Erro #02");
	}
}