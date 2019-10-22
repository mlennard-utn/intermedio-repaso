package ar.edu.utn.intermedio.java.ejercicio2;

public class Vehiculo {
	private Integer cantidadRuedas;
	private String color;
	private String marca;
	private Integer cantidadMarchas;
	private Integer velocidadMaxima;
	
	public float velocidadPorMarcha() {
		return velocidadMaxima / cantidadMarchas;
	}
	
	public float velocidadMaximaPorRueda() {
		return velocidadMaxima / getCantidadRuedas();
	}
	
	public Integer getCantidadRuedas() {
		return cantidadRuedas;
	}
	public void setCantidadRuedas(Integer cantidadRuedas) {
		this.cantidadRuedas = cantidadRuedas;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Integer getCantidadMarchas() {
		return cantidadMarchas;
	}
	public void setCantidadMarchas(Integer cantidadMarchas) {
		this.cantidadMarchas = cantidadMarchas;
	}
	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(Integer velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	
	
	
}
