package trabajos_universidad.reto3;

public abstract class Asiento {

	final double LIMITE_INCLINACION_SUPERIOR = 135;
	final double LIMITE_INCLINACION_INFERIOR = 0;

	// constructor
	char tipo;
	String ID;

	boolean pantallaEncendida = false;
	double inclinacionSilla = 90;
	boolean luzLecturaEncendida = false;
	boolean luzAsistenciaEncendida = false;
	boolean aireAcondicionadoEncendido = false;

//	constructor

	public Asiento(String id, char tipo ) {
		this.tipo = tipo;
		this.ID = id;
	}

	// methods

	public void gestionarAireAcondicionado() {
		this.aireAcondicionadoEncendido = !this.aireAcondicionadoEncendido;
	}

	public void gestionarPantalla() {
		this.pantallaEncendida = !this.pantallaEncendida;
	}

	public void gestionarLuzLectura() {
		this.luzLecturaEncendida = !this.luzLecturaEncendida;
	}

	public void gestionarLuzAsistencia() {
		this.luzAsistenciaEncendida = !this.luzAsistenciaEncendida;
	}

	// podria ir hasta el limite superior si sobrepasa el numero
	public void aumentarInclinacion(double d) {
		if (LIMITE_INCLINACION_SUPERIOR >= this.inclinacionSilla + d) {
			this.inclinacionSilla += d;
		}
		else {
			this.inclinacionSilla = LIMITE_INCLINACION_SUPERIOR;
		}
	}

	// podria ir hasta el limite inferior si sobrepasa el numero
	public void disminuirInclinacion(double d) {
		if (LIMITE_INCLINACION_INFERIOR <= this.inclinacionSilla - d) {
			this.inclinacionSilla -= d;
		}
		else {
			this.inclinacionSilla = LIMITE_INCLINACION_INFERIOR;
		}
	}

	
	
	public abstract String imprimirMenuPantalla();
	
	
	// getters and setters

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public boolean isPantallaEncendida() {
		return pantallaEncendida;
	}

	public void setPantallaEncendida(boolean pantallaEncendida) {
		this.pantallaEncendida = pantallaEncendida;
	}

	public double getInclinacionSilla() {
		return inclinacionSilla;
	}

	public void setInclinacionSilla(double inclinacionSilla) {
		this.inclinacionSilla = inclinacionSilla;
	}

	public boolean isLuzLecturaEncendida() {
		return luzLecturaEncendida;
	}

	public void setLuzLecturaEncendida(boolean luzLecturaEncendida) {
		this.luzLecturaEncendida = luzLecturaEncendida;
	}

	public boolean isLuzAsistenciaEncendida() {
		return luzAsistenciaEncendida;
	}

	public void setLuzAsistenciaEncendida(boolean luzAsistenciaEncendida) {
		this.luzAsistenciaEncendida = luzAsistenciaEncendida;
	}

	public boolean isAireAcondicionadoEncendido() {
		return aireAcondicionadoEncendido;
	}

	public void setAireAcondicionadoEncendido(boolean aireAcondicionadoEncendido) {
		this.aireAcondicionadoEncendido = aireAcondicionadoEncendido;
	}

	public double getLIMITE_INCLINACION_SUPERIOR() {
		return LIMITE_INCLINACION_SUPERIOR;
	}

	public double getLIMITE_INCLINACION_INFERIOR() {
		return LIMITE_INCLINACION_INFERIOR;
	} 
	
	
	
	


	

}
