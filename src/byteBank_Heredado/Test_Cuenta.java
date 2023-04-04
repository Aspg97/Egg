package byteBank_Heredado;

public class Test_Cuenta {
	public static void main(String[] args) {
		Cuenta_Corriente cc = new Cuenta_Corriente(1, 1);
		Cuenta_Ahorros ca = new Cuenta_Ahorros(2, 3);
		
		cc.depositar(5000);
		cc.transferir(1000, ca);
		//cc.retirar(200);
		//cc.retirar(200);
		System.out.println(cc.getSaldo());
		System.out.println(ca.getSaldo());
	}
}
