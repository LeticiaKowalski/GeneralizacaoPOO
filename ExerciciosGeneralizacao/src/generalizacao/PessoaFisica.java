package generalizacao;

public class PessoaFisica extends Pessoa {
	
	private String cpf;
	private String estadoCivil;
	
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String nome, String endereco, String cpf, String estadoCivil) {
		super(nome, endereco);
		setCpf(cpf);
		setEstadoCivil(estadoCivil);
	}
	
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		if (cpf.length() > 0)
			this.cpf = cpf;
	}
	
	public String getEstadoCivil() {
		return estadoCivil;
	}
	
	public void setEstadoCivil(String estadoCivil) {
		if (estadoCivil.length() > 0)
			this.estadoCivil = estadoCivil;
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa Física + ");
		builder.append(super.toString());
		builder.append("\n- CPF: ");
		builder.append(cpf);
		builder.append("\n- Estado Civil: ");
		builder.append(estadoCivil);
		return builder.toString();
	}
}
