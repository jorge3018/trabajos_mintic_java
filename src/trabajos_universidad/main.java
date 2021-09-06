package trabajos_universidad;

public class main {

	public static void main(String[] args) {

//		Autobus testAutobus = new Autobus("conductor" , 30);
//		
//		testAutobus.recogerPasajero(2);
//		
//		testAutobus.gestionarPuerta();
//		
//		testAutobus.gestionarMarcha();
//		
//		testAutobus.recogerPasajero(2);
//		
//		testAutobus.gestionarMarcha();
//		
//		testAutobus.gestionarPuerta();
//		
//		testAutobus.moverArriba(2);
//		
//		testAutobus.moverDerecha(5);
//		
//		testAutobus.gestionarWifi();
//		
//		testAutobus.gestionarAireAcondicionado();
//		
//		testAutobus.gestionarMotor();
//		
//		testAutobus.moverIzquierda(2);
//		
//		System.out.print(testAutobus.toString().replace(",", "\n"));

		///////////////////////////// DOS///////////////////////

//		Autobus a = new Autobus("conductor" , 2);
//		
//		a.gestionarPuerta();
//		a.recogerPasajero(1);
//		a.recogerPasajero(3);
//		a.recogerPasajero(6);
//		a.gestionarMarcha();
//		a.gestionarPuerta();
//		a.gestionarMarcha();
//		a.gestionarMotor();
//		a.gestionarMarcha();
//		a.moverArriba(1);
//		a.moverIzquierda(2);
//		a.moverAbajo(3);
//		a.recogerPasajero(6);
//		a.gestionarMarcha();
//		a.gestionarPuerta();
//		a.recogerPasajero(4);

//		System.out.print(a.toString().replace(",", "\n"));

//		Taxi taxi = new Taxi("Pepito");

//		taxi.gestionarMotor();
//		taxi.gestionarMarcha();
//		taxi.recogerPasajero();
//		
//		taxi.gestionarMarcha();
//		taxi.recogerPasajero();
//		taxi.moverArriba(1);
//		taxi.moverDerecha(12);
//		taxi.gestionarSeguros();
//		taxi.moverAbajo(10);
//		taxi.moverIzquierda(13);
//		
//		
//		taxi.gestionarAireAcondicionado();
//		taxi.gestionarWifi();
//		taxi.gestionarMotor();
//		taxi.presionarBotonPanico();

//		System.out.print(taxi.toString().replace(",", "\n"));

//		Taxi t = new Taxi("Pepito");
//
//		t.gestionarMotor();
//		t.gestionarMarcha();
//		t.recogerPasajero();
//		t.gestionarMarcha();
//		t.recogerPasajero();
//		t.moverArriba(10);
//		t.moverDerecha(12);
//		t.gestionarSeguros();
//		t.moverAbajo(10);
//		t.moverIzquierda(13);
//		t.gestionarAireAcondicionado();
//		t.gestionarWifi();
//		t.gestionarMotor();
//		t.presionarBotonPanico();
//		t.dejarPasajero();
//
//		System.out.print(t.toString().replace(",", "\n"));
		
		
		
		Taxi t = new Taxi("Pepito");
		
		t.gestionarMotor();
		t.recogerPasajero();
		t.gestionarSeguros(); 
		t.gestionarMarcha(); 
		t.moverAbajo(5); 
		t.moverDerecha(6);
		t.moverIzquierda(2); 
		t.gestionarSeguros(); 
		t.gestionarMarcha(); 
		t.dejarPasajero(); 
		t.dejarPasajero(); 
		t.gestionarSeguros(); 
		t.dejarPasajero(); 
		t.recogerPasajero(); 
		t.gestionarSeguros(); 
		t.moverArriba(1); 
		t.gestionarMarcha(); 
		t.gestionarSeguros(); 
		t.dejarPasajero();   


		System.out.print(t.toString().replace(",", "\n"));

	}

}
