package ar.edu.utn.intermedio.java.modelo;

public class Docente extends Persona {
	
	public Docente(String nombre, String apellido) {
		super(nombre, apellido);
	}

	private Integer codigoEmpleado;
	
	public Integer getCodigoEmpleado() {
		return codigoEmpleado;
	}

	public void setCodigoEmpleado(Integer codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}

	@Override
	public void identificarse() {
		// Debe mostrar en consola:
		// codigoEmpleado : apellido, nombre
		System.out.println(String.format("%d: %s, %s", codigoEmpleado, this.getApellido(), this.getNombre()));
	}
	
	
	
}
