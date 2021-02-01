package generalizacao;

public class ContaPrincipal {

	public static void main(String[] args) {
		
		Conta c = new Conta("Banco Santander", 11110, 1111110, 5000);
		System.out.println(c);
		System.out.println("\n");
		
		ContaSimples cs = new ContaSimples("Banco Santander", 11110, 1111110, 5000, 2000);
		System.out.println(cs);
		System.out.println("\n");
		
		ContaEspecial ce = new ContaEspecial("Banco Santander", 11110, 1111110, 5000, 10, 1000);
		System.out.println(ce);
		System.out.println("\n");
	}

}
