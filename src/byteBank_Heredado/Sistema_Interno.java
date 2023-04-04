package byteBank_Heredado;

public class Sistema_Interno {
	
	private String clave = "Alura";

	public boolean autenticar(Autenticable gerente) {
		boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
		if (puedeIniciarSesion) {
			System.out.println("Login Exitoso");
			return true;
		} else {
			System.out.println("Error en Login");
			return false;
		}

	}
}
