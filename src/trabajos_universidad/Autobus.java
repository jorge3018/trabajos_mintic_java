package trabajos_universidad;

public class Autobus extends Vehiculo {

	public Autobus(String nombreConductor, int nMaximoPasajeros) {
		super(nombreConductor, nMaximoPasajeros);
		System.out.println("es un bus");
	}

	boolean puertaAbierta = false;

	public void recogerPasajero(int estrato) {

		if (this.puertaAbierta == true && this.nMaximoPasajeros >= this.nPasajeros + 1 ) {
			this.nPasajeros += 1;
			this.cantidadDinero += this.calcularPasaje(estrato);
		}

	}

	public void gestionarPuerta() {
		this.puertaAbierta = this.puertaAbierta == false && this.enMarcha == false ? true : false;
	}

	public void gestionarMarcha() {

		this.enMarcha = this.motorEncendido == true && this.enMarcha == false && this.puertaAbierta == false ? true
				: false;

	}

	private double calcularPasaje(int estrato) {

		double result = 0;
		switch (estrato) {

		case 0:
		case 1:
		case 2:
			result = 1500;
			break;

		case 3:
		case 4:
			result = 2600;
			break;
		case 6:
		case 5:
			result = 3000;
			break;

		}
		return result;
	}

//	getters and setters

	public boolean isPuertaAbierta() {
		return puertaAbierta;
	}

	public void setPuertaAbierta(boolean puertaAbierta) {
		this.puertaAbierta = puertaAbierta;
	}

	@Override
	public String toString() {
		return "Autobus [puertaAbierta=" + puertaAbierta + ", nombreConductor=" + nombreConductor
				+ ", nMaximoPasajeros=" + nMaximoPasajeros + ", nPasajeros=" + nPasajeros + ", cantidadDinero="
				+ cantidadDinero + ", localizacionX=" + localizacionX + ", localizacionY=" + localizacionY
				+ ", aireAcondicionadoActivado=" + aireAcondicionadoActivado + ", motorEncendido=" + motorEncendido
				+ ", wifiEncendido=" + wifiEncendido + ", enMarcha=" + enMarcha + "]";
	}

}
