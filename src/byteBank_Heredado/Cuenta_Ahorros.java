package byteBank_Heredado;

public class Cuenta_Ahorros extends Cuenta {

	public Cuenta_Ahorros(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void depositar(double valor) {
		this.saldo += this.saldo + valor;

	}
}
