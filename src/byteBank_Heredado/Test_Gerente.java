package byteBank_Heredado;

public class Test_Gerente {
	public static void main(String[] args) {
		Gerente gerente1 = new Gerente();
		gerente1.setClave("Aulura");
		//Funcionario gerente = new Funcionario();
		gerente1.setSalario(6000);
		//gerente1.setTipo(1);
		System.out.println(gerente1.getBonificacion());
		System.out.println(gerente1.iniciarSesion("Alura"));
	}
}
