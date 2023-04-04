package byteBank_Heredado;

public class Test_Funcionario {
public static void main(String[] args) {
	Funcionario funcionario = new Contador();
			funcionario.setNombre("Anthony");
			funcionario.setDocumento("1711368124");
			funcionario.setSalario(2000);
			//funcionario.setTipo(0);
			
			System.out.println(funcionario.getSalario()+funcionario.getDocumento()+funcionario.getNombre());
			System.out.println(funcionario.getBonificacion());
}
}
