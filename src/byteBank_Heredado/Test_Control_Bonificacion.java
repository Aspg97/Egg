package byteBank_Heredado;

public class Test_Control_Bonificacion {
	public static void main(String[] args) {
		Funcionario Steven = new Contador();
		Gerente Anthony = new Gerente();
		Contador Pacheco = new Contador();
		
		//Funcionario ap = new Gerente();
		
		Steven.setSalario(2000);
		Anthony.setSalario(10000);
		Pacheco.setSalario(5000);
		
		Control_Bonificacion control = new Control_Bonificacion();
		control.registrarSalario(Steven);
		control.registrarSalario(Anthony);
		control.registrarSalario(Pacheco);
		
		System.out.println(control.getSuma());	
	}
}
