package byteBank_Heredado;

public class Autenticacion_util {
	
	private String clave;
	
	public boolean iniciarSesionS(String clave) {
		return this.clave == clave;
	}

	
	public void setClaveS(String clave) {
		this.clave = clave;

	}

	
}
