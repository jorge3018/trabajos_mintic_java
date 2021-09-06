package trabajos_universidad.reto4;

import java.util.ArrayList;

public class Restaurante {

	public Restaurante() {
		System.out.println(this);
	}

	ArrayList<Pedido> pedidos = new ArrayList<Pedido>();

	public boolean findBynPedido(Pedido assertpedido) {
		System.out.println("busca por pedido" );

		for (Pedido pedido : this.pedidos) {
			if (pedido.getnPedido().equals(assertpedido.getnPedido())) {
				return false;
			}
		}
		System.out.println("busca por pedido fin" );
		return true;
	}

	public void agregarPedidoLista(Pedido p) {
		System.out.println("agregar nuevo pedido " );
		if (findBynPedido(p)) {
			this.pedidos.add(p);
		}
		System.out.println("agregar nuevo pedido fin" );

	}

	public Pedido buscarPedidoBynPedido(ArrayList<Pedido> pedidos, String nPedido) {
		System.out.println("buscarPedidoBynPedido" );
		for (Pedido pedido : pedidos) {
			if (pedido.getnPedido().equals(nPedido)) {
				return pedido;
			}
		}
		System.out.println("buscarPedidoBynPedido fin" );

		return null;
	}

	public void eliminarPedido(String nPedido) {

		System.out.println("eliminando registro" );
		
		if (this.pedidos.size() == 0) {
			System.out.println("eliminando registro fin " );
			return;
		}
		
		if (this.pedidos.size() == 1) {
			this.pedidos.remove(0);
			System.out.println("eliminando registro fin " );
		} else {
			int indexborrar = this.pedidos.indexOf(buscarPedidoBynPedido(this.pedidos, nPedido));
			if (indexborrar < 0) {
				System.out.println(this.pedidos.size());
			}
			
			System.out.println("index para borrar" + indexborrar);
			this.pedidos.remove(this.pedidos.indexOf(buscarPedidoBynPedido(this.pedidos, nPedido)));
			System.out.println("eliminando registro fin " );
		}
		System.out.println("eliminando registro fin " );

	}

	public double calcularGanancias() {
		System.out.println("calculando ganancias" );
		double result = 0;
		for (Pedido pedido : this.pedidos) {
			if (pedido.getCostoPedido() != 0) {
				result += pedido.getCostoPedido();
			}
		}
		System.out.println("calculando ganancias fin" );

		return result;

	}

	public double promedioGananciasTotales() {
		System.out.println("promedio ganancias totales" );
		System.out.println(this.pedidos.size());
		System.out.println("promedio ganancias totales fin" );

		return this.calcularGanancias() / this.pedidos.size();
	}

	public double desviacionEstandarGananciasTotales() {
		System.out.println("desviacion estandar" );

		double sumatoria = 0;
		double varianza = 0;

		double media = this.promedioGananciasTotales();
		for (Pedido pedido : this.pedidos) {
			sumatoria += Math.pow(pedido.getCostoPedido() - media, 2);
		}
		varianza = sumatoria / (this.pedidos.size() - 1);
		System.out.println("desviacion estandar fin" );


		return Math.sqrt(varianza);

	}

	public double retornarCostoPedido(String ID) {
		System.out.println("retorna costo pedidos " );

		for (Pedido pedido : this.pedidos) {
			if (pedido.getnPedido().equals(ID)) {
				return pedido.getCostoPedido();
			}
		}
		System.out.println("retorna costo pedidos fin" );

		return 0;

	}

	// getters and setters

	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	@Override
	public String toString() {
		return "Restaurante [pedidos=" + pedidos + "]";
	}

}
