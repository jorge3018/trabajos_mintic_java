package trabajos_universidad.reto4;

import java.util.ArrayList;

public class Pedido {

	// constructor attributes

	String nPedido;
	String IDCliente;
	double costoPedido;
	int diaPedido;
	int mesPedido;
	int yearPedido;
	
	
	
	// contructor
	public Pedido(String nPedido, String iDCliente, double costoPedido, int diaPedido, int mesPedido, int yearPedido) {
		this.nPedido = nPedido;
		IDCliente = iDCliente;
		this.costoPedido = costoPedido;
		this.diaPedido = diaPedido;
		this.mesPedido = mesPedido;
		this.yearPedido = yearPedido;
		
		System.out.println(this);
	}



	public String getnPedido() {
		return nPedido;
	}



	public void setnPedido(String nPedido) {
		this.nPedido = nPedido;
	}



	public String getIDCliente() {
		return IDCliente;
	}



	public void setIDCliente(String iDCliente) {
		IDCliente = iDCliente;
	}



	public double getCostoPedido() {
		return costoPedido;
	}



	public void setCostoPedido(double costoPedido) {
		this.costoPedido = costoPedido;
	}



	public int getDiaPedido() {
		return diaPedido;
	}



	public void setDiaPedido(int diaPedido) {
		this.diaPedido = diaPedido;
	}



	public int getMesPedido() {
		return mesPedido;
	}



	public void setMesPedido(int mesPedido) {
		this.mesPedido = mesPedido;
	}



	public int getYearPedido() {
		return yearPedido;
	}



	public void setYearPedido(int yearPedido) {
		this.yearPedido = yearPedido;
	}



	@Override
	public String toString() {
		return "Pedido [nPedido=" + nPedido + ", IDCliente=" + IDCliente + ", costoPedido=" + costoPedido
				+ ", diaPedido=" + diaPedido + ", mesPedido=" + mesPedido + ", yearPedido=" + yearPedido + "]";
	}
	
	
	
	
}
