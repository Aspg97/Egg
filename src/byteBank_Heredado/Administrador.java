package byteBank_Heredado;

public class Administrador extends Funcionario implements Autenticable {
	
	private Autenticacion_util util;
	
	public Administrador() {
		this.util = new Autenticacion_util();
	}
	@Override
	public double getBonificacion() {
		return this.getSalario();
	}

	@Override
	public void setClave(String clave) {
		this.util.setClaveS(clave);
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesionS(clave);
	}
	
}
