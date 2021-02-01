package generalizacao;

public class Conta {
	
	
	private String banco;
	private int agencia;
	private int numeroConta;
	private double saldo;
	
	
	public Conta() {
		
	}
	
	public Conta(String banco, int agencia, int numeroConta, double saldo) {
		setBanco(banco);
		setAgencia(agencia);
		setNumeroConta(numeroConta);
		setSaldo(saldo);
	}
	
	
	public String getBanco() {
		return banco;
	}
	
	public void setBanco(String banco) {
		if (banco.length() > 0)
			this.banco = banco;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		if (agencia > 0)
			this.agencia = agencia;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta(int numeroConta) {
		if (numeroConta > 0)
			this.numeroConta = numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		if (saldo > 0)
			this.saldo = saldo;
	}
	
	
	public boolean deposito(double valor) {
		
		if (valor > 0) {
			setSaldo (valor + getSaldo());
			return true;
		} else {
			return false;
		}
	}
	
	public boolean saque(double valor) {
		
		if (valor <= getSaldo()) {
			setSaldo (getSaldo() - valor);
			return true;
		} else {
			return false;
		}
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conta: ");
		builder.append("\n- Banco: ");
		builder.append(banco);
		builder.append("\n- Agência: ");
		builder.append(agencia);
		builder.append("\n- Número conta: ");
		builder.append(numeroConta);
		builder.append("\n- Saldo: ");
		builder.append(saldo);
		builder.append("\n- Depósito: ");
		builder.append(deposito(saldo));
		builder.append("\n- Saque: ");
		builder.append(saque(saldo));
		return builder.toString();
	}
	
}
