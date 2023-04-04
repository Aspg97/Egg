package byteBank_Heredado;

public class Cliente implements Autenticable {

	private String nombre;
	private String documento;
	private String telefono;
	
	private Autenticacion_util util;

	public Cliente() {
		this.util = new Autenticacion_util();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesionS(clave);
	}

	@Override
	public void setClave(String clave) {
		this.util.setClaveS(clave);

	}

}
