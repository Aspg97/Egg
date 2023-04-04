package byteBank_Heredado;

public class Test_Referencias {
	public static void main(String[] args) {
		//Funcionario funcionario0 = new Gerente();
		//funcionario0.iniciarSesion("abcd");
		
		
		
		Funcionario funcionario = new Contador();
		funcionario.setNombre("Steven");
		Gerente gerente = new Gerente();
		gerente.setNombre("Anthony");
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
		System.out.println(gerente.iniciarSesion("abcd"));
		
	}
}
