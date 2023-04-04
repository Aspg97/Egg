package byteBank_Heredado;

public class Control_Bonificacion {
	private double suma;
	
	public double registrarSalario(Funcionario funcionario) {
		this.suma += funcionario.getBonificacion();
		return this.suma;
	}

	
	public double getSuma () {
		return this.suma;
	}
}
