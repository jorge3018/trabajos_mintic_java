package trabajos_universidad;

public class Taxi extends Vehiculo {

	public Taxi(String nombreConductor) {
		super(nombreConductor);
		// TODO Auto-generated constructor stub
	}

	double distanciaRecorrida = 0;
	boolean segurosActivados = false;

	public void reiniciarTaximetro() {
		this.distanciaRecorrida = 0;
	}

	public void presionarBotonPanico() {
		this.enMarcha = false;
		this.segurosActivados = false;
		this.cantidadDinero = 0;
	}

	public void dejarPasajero() {
		this.nPasajeros -= 1;
		this.reiniciarTaximetro();
		this.cantidadDinero += this.calcularPasaje();
	}

	public void recogerPasajero() {
		this.nPasajeros += 1;
	}

	public void gestionarMarcha() {
		this.enMarcha = this.enMarcha = false && this.segurosActivados == true ? true : false;
	}
	

//	getters and setters

	public double getDistanciaRecorrida() {
		return distanciaRecorrida;
	}

	public void setDistanciaRecorrida(double distanciaRecorrida) {
		this.distanciaRecorrida = distanciaRecorrida;
	}

	public boolean isSegurosActivados() {
		return segurosActivados;
	}

	public void setSegurosActivados(boolean segurosActivados) {
		this.segurosActivados = segurosActivados;
	}

}
