package trabajos_universidad;

public abstract class Vehiculo {

	// variables en le constructor
	String nombreConductor;
	int nMaximoPasajeros;

	int nPasajeros = 0;
	double cantidadDinero = 0;
	double localizacionX = 0;
	double localizacionY = 0;
	boolean aireAcondicionadoActivado = false;
	boolean motorEncendido = false;
	boolean wifiEncendido = false;
	boolean enMarcha = false;


public Vehiculo(String nombreConductor, int nMaximoPasajeros) {
		super();
		this.nombreConductor = nombreConductor;
		this.nMaximoPasajeros = nMaximoPasajeros;
	}

//		class methods

	public void dejarPasajero() {
		this.nPasajeros -= 1;
	}

	public double calcularDistanciaAcopio() {
		return Math.sqrt((Math.pow(localizacionX, 2) + (Math.pow(localizacionY, 2))));
	}

	public void gestionarAireAcondicionado() {
		// TODO Auto-generated method stub
		this.aireAcondicionadoActivado = this.motorEncendido == true && this.aireAcondicionadoActivado == false ? true
				: false;
	}

	public void gestionarMotor() {
		this.motorEncendido = !this.motorEncendido;
		if (!this.motorEncendido) {
			this.aireAcondicionadoActivado = false;
			this.wifiEncendido = false;
			this.enMarcha = false;
		}
	}

	public void gestionarWifi() {
		// TODO Auto-generated method stub
		this.wifiEncendido = this.motorEncendido == true && this.wifiEncendido == false ? true : false;
	}

	public abstract void gestionarMarcha();

	public void moverDerecha(double d) {
		this.localizacionX += this.enMarcha == true ? d : 0;
	}

	public void moverIzquierda(double d) {
		this.localizacionX -= this.enMarcha == true ? d : 0;
	}

	public void moverArriba(double d) {
		this.localizacionY += this.enMarcha == true ? d : 0;
	}

	public void moverAbajo(double d) {
		this.localizacionY -= this.enMarcha == true ? d : 0;
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

	@Override
	public String toString() {
		return "Vehiculo [nombreConductor=" + nombreConductor + ", nMaximoPasajeros=" + nMaximoPasajeros
				+ ", nPasajeros=" + nPasajeros + ", cantidadDinero=" + cantidadDinero + ", localizacionX="
				+ localizacionX + ", localizacionY=" + localizacionY + ", aireAcondicionadoActivado="
				+ aireAcondicionadoActivado + ", motorEncendido=" + motorEncendido + ", wifiEncendido=" + wifiEncendido
				+ ", enMarcha=" + enMarcha + ", calcularDistanciaAcopio()=" + calcularDistanciaAcopio()
				+ ", getNombreConductor()=" + getNombreConductor() + ", getnPasajeros()=" + getnPasajeros()
				+ ", getnMaximoPasajeros()=" + getnMaximoPasajeros() + ", getCantidadDinero()=" + getCantidadDinero()
				+ ", getLocalizacionX()=" + getLocalizacionX() + ", getLocalizacionY()=" + getLocalizacionY()
				+ ", isAireAcondicionadoActivado()=" + isAireAcondicionadoActivado() + ", isMotorEncendido()="
				+ isMotorEncendido() + ", isWifiEncendido()=" + isWifiEncendido() + ", isEnMarcha()=" + isEnMarcha()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	

}
