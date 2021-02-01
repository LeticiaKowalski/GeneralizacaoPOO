package generalizacao;

public class Pessoa {
	
	private String nome;
	private String endereco;
	
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String endereco) {
		setNome(nome);
		setEndereco(endereco);
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if (nome.length() > 0)
			this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		if (endereco.length() > 0)
			this.endereco = endereco;
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Classe Pessoa ");
		builder.append("\n- Nome: ");
		builder.append(nome);
		builder.append("\n- Endereço: ");
		builder.append(endereco);
		return builder.toString();
	}
	
	
	
	
}
