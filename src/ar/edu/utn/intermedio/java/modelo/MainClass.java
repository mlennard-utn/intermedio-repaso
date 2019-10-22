package ar.edu.utn.intermedio.java.modelo;

public class MainClass {

	public static void main(String[] args) {
		Persona p = new Persona("Nombre","Apellido");
		p.identificarse();
		
		Alumno a = new Alumno("Nombre alumno", "apellido alumno");
		a.setLegajo(123132);
		a.identificarse();
		
		Docente d = new Docente("Martin", "Lennard");
		d.setCodigoEmpleado(12321);
		d.identificarse();
	}

}
