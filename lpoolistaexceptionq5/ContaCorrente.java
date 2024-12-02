package lpoolistaexceptionq5;

public class ContaCorrente {
	private String numeroConta;
	private double saldo;
	
	public ContaCorrente(String numeroConta, double saldo) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	
	public String getNumeroConta() {
		return numeroConta;
	}
	
	
	public double getSaldo() {
		return saldo;
	}
	

	public void saque(double valor) throws SaldoInsuficienteException{
		if(valor <= this.saldo) {
			this.saldo -= valor;
		}else {
			throw new SaldoInsuficienteException("Saldo insuficiente para este saque.");
		}
	}
}
