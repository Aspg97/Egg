package byteBank_Heredado;

public abstract class Cuenta {
	protected double saldo;
	private int agencia = 1;
	private int numero;
	private Cliente titular = new Cliente();
	private static int numCuenta = 0;


	public Cuenta(int agencia, int numero) {


			this.agencia = agencia;
			this.numero = numero;

		numCuenta++;
		System.out.println("Se van creando " + numCuenta + " Cuentas");
	}

	// no retornan valor
	public abstract void depositar(double valor);

	// retornan valor
	public void retirar(double retiro) throws SaldoInsuficienteException{
		if(this.saldo<retiro) {
			throw new SaldoInsuficienteException("No tienes saldo");
		}	
		this.saldo -= retiro;
	}

	public boolean transferir(double transferencia, Cuenta cuenta) {
		if (this.saldo >= transferencia) {
			try {
				this.retirar(transferencia);
			} catch (SaldoInsuficienteException e) {
				e.printStackTrace();
			}
			cuenta.depositar(transferencia);
			return true;
		} else
			return false;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setAgencia(int nuevaAgencia) {
		if (nuevaAgencia > 0)
			this.agencia = nuevaAgencia;
		else
			System.out.println("No esta permitido numeros negativos");
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}


}
