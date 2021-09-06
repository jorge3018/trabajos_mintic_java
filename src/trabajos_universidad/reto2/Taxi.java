package trabajos_universidad.reto2;

public class Taxi extends Vehiculo {

	public Taxi(String nombreConductor) {
		super(nombreConductor, 1);
		System.out.println("es un taxi");
	}

	double distanciaRecorrida = 0;
	boolean segurosActivados = false;

	public void reiniciarTaximetro() {
		this.distanciaRecorrida = 0;
	}

	public void presionarBotonPanico() {
		if (this.nPasajeros > 0) {

			this.motorEncendido = false;
			this.enMarcha = false;
			this.segurosActivados = false;
			this.aireAcondicionadoActivado = false;
			this.wifiEncendido = false;
			double ant = this.cantidadDinero;
			this.dejarPasajero();
			this.cantidadDinero = ant;
		}
	}

	public void dejarPasajero() {

		if (this.nPasajeros == 1 && this.enMarcha == false) {
			this.nPasajeros -= 1;
			this.cantidadDinero += this.calcularPasaje();
			this.reiniciarTaximetro();
		}
	}

	private double calcularPasaje() {
		return 3000 + (2300 * this.distanciaRecorrida);
	}

	public void recogerPasajero() {

		this.nPasajeros += this.segurosActivados == false && this.enMarcha == false && this.nPasajeros == 0 ? 1 : 0;
	}

	public void gestionarMarcha() {
		this.enMarcha = this.enMarcha == false && this.segurosActivados == true && this.motorEncendido == true ? true
				: false;
	}

	public void gestionarSeguros() {
		if (!this.enMarcha) {
			this.segurosActivados = this.segurosActivados == false ? true : false;
		}
	}

	@Override
	public void moverDerecha(double d) {
		this.localizacionX += this.enMarcha == true ? d : 0;
		if (this.nPasajeros == 1 && this.enMarcha == true) {
			this.distanciaRecorrida += d;

		}
	}

	@Override
	public void moverIzquierda(double d) {
		this.localizacionX -= this.enMarcha == true ? d : 0;
		if (this.nPasajeros == 1 && this.enMarcha == true) {
			this.distanciaRecorrida += d;

		}
	}

	@Override
	public void moverArriba(double d) {
		this.localizacionY += this.enMarcha == true ? d : 0;
		if (this.nPasajeros == 1 && this.enMarcha == true) {
			this.distanciaRecorrida += d;

		}
	}

	@Override
	public void moverAbajo(double d) {
		this.localizacionY -= this.enMarcha == true ? d : 0;
		if (this.nPasajeros == 1 && this.enMarcha == true) {
			this.distanciaRecorrida += d;

		}
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

	@Override
	public String toString() {
		return "Taxi [distanciaRecorrida=" + distanciaRecorrida + ", segurosActivados=" + segurosActivados
				+ ", nombreConductor=" + nombreConductor + ", nMaximoPasajeros=" + nMaximoPasajeros + ", nPasajeros="
				+ nPasajeros + ", cantidadDinero=" + cantidadDinero + ", localizacionX=" + localizacionX
				+ ", localizacionY=" + localizacionY + ", aireAcondicionadoActivado=" + aireAcondicionadoActivado
				+ ", motorEncendido=" + motorEncendido + ", wifiEncendido=" + wifiEncendido + ", enMarcha=" + enMarcha
				+ "]";
	}

}
