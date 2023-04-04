package byteBank_Heredado;

public class Gerente extends Funcionario implements Autenticable {
	
	private Autenticacion_util util;
		
	public Gerente() {
		this.util = new Autenticacion_util();
	}
	
	@Override
	public double getBonificacion() {
		return this.getSalario()+this.getSalario();
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return this.util.iniciarSesionS(clave);
	}

	@Override
	public void setClave(String clave) {
		this.util.setClaveS(clave);
		
	}
}
