package byteBank_Heredado;

public class Test_Sistema_Interno {
public static void main(String[] args) {
	Sistema_Interno sistema = new Sistema_Interno();
	Gerente gerente1 = new Gerente();
	Administrador administrador1 = new Administrador();
	
	sistema.autenticar(gerente1);
	sistema.autenticar(administrador1);
}
}
