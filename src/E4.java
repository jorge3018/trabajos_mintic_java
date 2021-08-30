import java.util.Arrays;
import java.util.Collections;



public class E4 {

	public static void main(String[] args) {

		Personaje prueba = new Personaje("prueba", 'a');
		System.out.print(prueba.getNombre());

	}

}

class Personaje {
// 	Inserte acá los atributos

	private String nombre;
	private char sexo;

	private double posicionX = 0;
	private double posicionY = 0;
	private double distanciaTotal = 0;

	private int numeroBotiquines = 0;
	private double vida = 100;

//	constructor
	public Personaje(String nombre, char sexo) {
		this.nombre = nombre;
		this.sexo = sexo;
	}

	public void usarBotiquin() {
		if (this.numeroBotiquines > 0) {
			
			this.numeroBotiquines -= 1;
			this.vida += 5;
		}

	}

	public void recogerBotiquin() {

		this.numeroBotiquines += 1;

	}

	public void moverDerecha(double d) {

		this.posicionX += d;
		this.distanciaTotal += d;

	}

	public void moverIzquierda(double d) {

		this.posicionX -= d;
		this.distanciaTotal += d;

	}

	public void moverArriba(double d) {

		this.posicionY += d;
		this.distanciaTotal += d;

	}

	public void moverAbajo(double d) {

		this.posicionY -= d;
		this.distanciaTotal += d;

	}

	public double calcularDistanciaRespectoOrigen() {

		return Math.sqrt(Math.pow(this.posicionX, 2) + Math.pow(this.posicionY, 2));

	}

//	getters and setters

	public double getVida() {
		return vida;
	}

	public void setVida(double vida) {
		this.vida = vida;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPosicionX() {
		return posicionX;
	}

	public void setPosicionX(double posicionX) {
		this.posicionX = posicionX;
	}

	public double getPosicionY() {
		return posicionY;
	}

	public void setPosicionY(double posicionY) {
		this.posicionY = posicionY;
	}

	public double getDistanciaTotal() {
		return distanciaTotal;
	}

	public void setDistanciaTotal(double distanciaTotal) {
		this.distanciaTotal = distanciaTotal;
	}

	public int getNumeroBotiquines() {
		return numeroBotiquines;
	}

	public void setNumeroBotiquines(int numeroBotiquines) {
		this.numeroBotiquines = numeroBotiquines;
	}

}
