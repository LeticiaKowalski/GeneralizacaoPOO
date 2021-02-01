package generalizacao;

public class ContaSimples extends Conta {
	
	private double saldoPoupanca;

	
	public ContaSimples() {
		
	}
	
	public ContaSimples(String banco, int agencia, int numeroConta, double saldo,
			double saldoPoupanca) {
		super(banco, agencia, numeroConta, saldo);
		setSaldoPoupanca(saldoPoupanca);
	}
	
	
	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		if (saldoPoupanca > 0)
			this.saldoPoupanca = saldoPoupanca;
	}

	
	public boolean depositoPoupanca(double valor) {
		
		if (valor > 0) {
			setSaldoPoupanca (valor + getSaldoPoupanca());
			return true;
		} else {
			return false;
		}
	}
	
	public boolean saquePoupanca(double valor) {
		
		if (valor <= getSaldoPoupanca()) {
			setSaldoPoupanca (getSaldoPoupanca() - valor);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conta Simples + ");
		builder.append(super.toString());
		builder.append("\n- Saldo Poupança: ");
		builder.append(saldoPoupanca);
		builder.append("\n- Depósito Poupança: ");
		builder.append(depositoPoupanca(saldoPoupanca));
		builder.append("\n- Saque Poupança: ");
		builder.append(saquePoupanca(saldoPoupanca));
		return builder.toString();
	}

}
