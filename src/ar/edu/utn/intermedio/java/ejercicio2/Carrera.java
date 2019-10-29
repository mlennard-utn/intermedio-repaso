package ar.edu.utn.intermedio.java.ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Carrera {

	public static void main(String[] args) {
		ArrayList<Moto> listaMotos = new ArrayList<>();
		
		Moto moto1 = new Moto();
		moto1.setMarca("Yamaha");
		moto1.setColor("Amarillo");
		listaMotos.add(moto1);
		
		Moto moto2 = new Moto();
		moto2.setMarca("Motomel");
		moto2.setColor("Rojo");
		listaMotos.add(moto2);
		
		Moto moto3 = new Moto();
		moto3.setMarca("Ducati");
		moto3.setColor("Negro");
		listaMotos.add(moto3);
		
		Integer minimo = Integer.MAX_VALUE;
		String masLenta = "";
		Integer velocidad = 0;
				
		Scanner scanner = new Scanner(System.in);
		for (Moto moto : listaMotos) {
			System.out.println("Ingrese velocidad: " + moto.getMarca());
			moto.setVelocidadMaxima(scanner.nextInt());
			velocidad = moto.avanzar(120);
			
			if (velocidad == Math.min(velocidad, minimo)) {
				minimo = velocidad;
				masLenta = moto.getMarca();
			}
		}
	
		System.out.println("Moto mas lenta: " + masLenta);
		
	}

}
