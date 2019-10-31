package ar.edu.utn.intermedio.java.ejercicio2;

public class Moto extends Vehiculo implements Comparable<Moto> {

	@Override
	public Integer getCantidadRuedas() {
		return 2;
	}

	@Override
	public int compareTo(Moto otraMoto) {
		// Devolver un numero positivo si 
		// la moto es mas rapida que la moto del parametro
		int miVelocidad = this.getVelocidadMaxima();
		int velocidadDeLaOtraMoto = otraMoto.getVelocidadMaxima();
		
		return miVelocidad - velocidadDeLaOtraMoto;
		
		// Devolver un numero negativo si la moto es 
		// mas lenta que la moto del parametro
		
		// Devolver 0 si tienen la misma velocidad
		
		
	}
	
}
