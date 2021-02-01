package generalizacao;

public class PessoaPrincipal {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Marcelo", "Rio do Sul");
		System.out.println(p);
		System.out.println("\n");
		
		PessoaFisica pf = new PessoaFisica("Roberto", "Joinville", "001.001.001-00", "Casado");
		System.out.println(pf);
		
		PessoaJuridica pj = new PessoaJuridica("Laura", "Florianópolis", "01.001.001/0001-01", "MEI");
		System.out.println(pj);
		System.out.println("\n");
	}

}
