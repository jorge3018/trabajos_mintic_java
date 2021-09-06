package trabajos_universidad.reto4;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurante prueba = new Restaurante();
		Pedido pedido1 = new Pedido("a","1000",123,1,5,2021);
		Pedido pedido2 = new Pedido(" b","2000",123,1,5,2021);
		prueba.agregarPedidoLista(pedido1);
		prueba.agregarPedidoLista(pedido2);
		
		prueba.eliminarPedido("a");
		prueba.eliminarPedido("b");
		prueba.eliminarPedido("a");
		prueba.eliminarPedido("d");
		
		System.out.println(prueba);

	}

}
