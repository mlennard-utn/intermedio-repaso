package ar.edu.utn.intermedio.java.ejercicio2;

import java.util.Comparator;

public class ComparadorVelocidad implements Comparator<Vehiculo> {

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		return (int) (o2.velocidadMaximaPorRueda() - o1.velocidadMaximaPorRueda()) ;
		
	}

}
