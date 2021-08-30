package trabajos_universidad;

public class Autobus extends Vehiculo {

	public Autobus(String nombreConductor) {
		super(nombreConductor);
		// TODO Auto-generated constructor stub
	}

	boolean puertaAbierta = false;

	public void recogerPasajero(int estrato) {
		this.cantidadDinero += this.calcularPasaje(estrato);

		this.nPasajeros += this.nMaximoPasajeros <= this.nPasajeros + 1 ? 1 : 0;

	}

	public void gestionarPuerta() {
		this.puertaAbierta = this.puertaAbierta == false && this.enMarcha == false ? true : false;
	}

	public void gestionarMarcha() {
		this.enMarcha = this.enMarcha == false && this.puertaAbierta == false ? true : false;

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
			result = 2600;
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

}
