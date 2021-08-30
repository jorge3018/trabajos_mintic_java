package trabajos_universidad;

public class Vehiculo {

	// variables en le constructor
	String nombreConductor;

	int nPasajeros = 0;
	int nMaximoPasajeros;
	double cantidadDinero = 0;
	double localizacionX = 0;
	double localizacionY = 0;
	boolean aireAcondicionadoActivado = false;
	boolean motorEncendido = false;
	boolean wifiEncendido = false;
	boolean enMarcha = false;

	public Vehiculo(String nombreConductor) {
		super();
		this.nombreConductor = nombreConductor;
	}

//		class methods

	public void dejarPasajero() {
		this.nPasajeros -= 1;
	}

	public double calcularDistanciaAcopio() {
		// TODO Auto-generated method stub
		return this.localizacionX + this.localizacionY;
	}

	public void gestionarAireAcondicionado() {
		// TODO Auto-generated method stub
		this.aireAcondicionadoActivado = this.motorEncendido == true && this.aireAcondicionadoActivado == false ? true
				: false;
	}

	public void gestionarMotor() {
		// TODO Auto-generated method stub
		this.motorEncendido = this.motorEncendido == false ? true : false;
	}

	public void gestionarWifi() {
		// TODO Auto-generated method stub
		this.wifiEncendido = this.motorEncendido == true && this.wifiEncendido == false ? true : false;
	}

	public void gestionarMarcha() {
	};

	public void moverDerecha(double d) {
		this.localizacionX += this.enMarcha == true ? 1 : 0;
	}

	public void moverIzquierda(double d) {
		this.localizacionX -= this.enMarcha == true ? 1 : 0;
	}

	public void moverArriba(double d) {
		this.localizacionY += this.enMarcha == true ? 1 : 0;
	}

	public void moverAbajo(double d) {
		this.localizacionY -= this.enMarcha == true ? 1 : 0;
	}
	
	
	
	

//		getters and setters

	public String getNombreConductor() {
		return nombreConductor;
	}

	public void setNombreConductor(String nombreConductor) {
		this.nombreConductor = nombreConductor;
	}

	public int getnPasajeros() {
		return nPasajeros;
	}

	public void setnPasajeros(int nPasajeros) {
		this.nPasajeros = nPasajeros;
	}

	public int getnMaximoPasajeros() {
		return nMaximoPasajeros;
	}

	public void setnMaximoPasajeros(int nMaximoPasajeros) {
		this.nMaximoPasajeros = nMaximoPasajeros;
	}

	public double getCantidadDinero() {
		return cantidadDinero;
	}

	public void setCantidadDinero(double cantidadDinero) {
		this.cantidadDinero = cantidadDinero;
	}

	public double getLocalizacionX() {
		return localizacionX;
	}

	public void setLocalizacionX(double localizacionX) {
		this.localizacionX = localizacionX;
	}

	public double getLocalizacionY() {
		return localizacionY;
	}

	public void setLocalizacionY(double localizacionY) {
		this.localizacionY = localizacionY;
	}

	public boolean isAireAcondicionadoActivado() {
		return aireAcondicionadoActivado;
	}

	public void setAireAcondicionadoActivado(boolean aireAcondicionadoActivado) {
		this.aireAcondicionadoActivado = aireAcondicionadoActivado;
	}

	public boolean isMotorEncendido() {
		return motorEncendido;
	}

	public void setMotorEncendido(boolean motorEncendido) {
		this.motorEncendido = motorEncendido;
	}

	public boolean isWifiEncendido() {
		return wifiEncendido;
	}

	public void setWifiEncendido(boolean wifiEncendido) {
		this.wifiEncendido = wifiEncendido;
	}

	public boolean isEnMarcha() {
		return enMarcha;
	}

	public void setEnMarcha(boolean enMarcha) {
		this.enMarcha = enMarcha;
	}

}
