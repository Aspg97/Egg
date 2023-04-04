package byteBank_Heredado;

public class Cuenta_Corriente extends Cuenta {

	public Cuenta_Corriente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void retirar(double retiro) throws SaldoInsuficienteException{
		double comision = 0.2;
		super.retirar(retiro + comision);
	}

	@Override
	public void depositar(double valor) {
		this.saldo += this.saldo + valor;

	}

}
