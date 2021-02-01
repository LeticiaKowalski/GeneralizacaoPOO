package generalizacao;

public class ContaEspecial extends Conta {
	
	private int diasSemJuros;
	private double limite;
	
	
	public ContaEspecial() {
		
	}
	
	public ContaEspecial(String banco, int agencia, int numeroConta, double saldo,
			int diasSemJuros, double limite) {
		super(banco, agencia, numeroConta, saldo);
		setDiasSemJuros(diasSemJuros);
		setLimite(limite);
	}
	
	
	public int getDiasSemJuros() {
		return diasSemJuros;
	}
	
	public void setDiasSemJuros(int diasSemJuros) {
		if (diasSemJuros > 0)
			this.diasSemJuros = diasSemJuros;
	}
	
	public double getLimite() {
		return limite;
	}
	
	public void setLimite(double limite) {
		if (limite > 0)
			this.limite = limite;
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conta Especial + ");
		builder.append(super.toString());
		builder.append("\n- Dias Sem Juros: ");
		builder.append(diasSemJuros);
		builder.append("\n- Limite: ");
		builder.append(limite);
		return builder.toString();
	}	
}
