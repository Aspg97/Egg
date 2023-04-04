package byteBank_Heredado;

public class TestCuentaExceptionSaca {
public static void main(String[] args) {
	Cuenta cuenta = new Cuenta_Ahorros(123, 456);
	cuenta.depositar(200);
	try {
		cuenta.retirar(201);
	} catch (SaldoInsuficienteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
