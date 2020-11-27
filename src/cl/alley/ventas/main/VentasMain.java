package cl.alley.ventas.main;

import cl.alley.ventas.*;

public class VentasMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Producto producto1 = new Producto("Camisa", 50.0);
		Producto producto2 = new Producto("Pantalon", 100.0);
		Producto producto3 = new Producto("Zapatos", 250.0);
		
		Orden orden1 = new Orden();
		orden1.agregarProducto(producto1);
		orden1.agregarProducto(producto2);
		orden1.mostrarOrden();
		
		Orden orden2 = new Orden();
		orden2.agregarProducto(producto1);
		orden2.agregarProducto(producto2);
		orden2.agregarProducto(producto3);
		orden2.mostrarOrden();
	}

}
