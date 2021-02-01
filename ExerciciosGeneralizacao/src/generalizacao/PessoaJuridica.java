package generalizacao;

public class PessoaJuridica extends Pessoa {
	
	private String cnpj;
	private String tipoEmpresa;
	
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String nome, String endereco, String cnpj, String tipoEmpresa) {
		super(nome, endereco);
		setCnpj(cnpj);
		setTipoEmpresa(tipoEmpresa);
	}
	
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		if (cnpj.length() > 0)
			this.cnpj = cnpj;
	}
	
	public String getTipoEmpresa() {
		return tipoEmpresa;
	}
	
	public void setTipoEmpresa(String tipoEmpresa) {
		if (tipoEmpresa.length() > 0)
			this.tipoEmpresa = tipoEmpresa;
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nPessoa Jurídica + ");
		builder.append(super.toString());
		builder.append("\n- CNPJ: ");
		builder.append(cnpj);
		builder.append("\n- Tipo empresa: ");
		builder.append(tipoEmpresa);
		return builder.toString();
	}

}
