package cl.alley.ventas;

public class Orden {

	//Atributos 1
	private int idOrden;
	private Producto productos[];
	private static int contadorOrdenes;
	private static final int MAX_PRODUCTOS = 10;
	private int contadorProductos;
	
	//Constructores
	
	public Orden() {
		this.idOrden = ++Orden.contadorOrdenes;
		//por convención se coloca el nombre de la clase antes del contador
		this.productos = new Producto[Orden.MAX_PRODUCTOS];
		//Inicialización de arreglo de productos. Si no se inicializa, el arreglo queda null.
		//La constante MAX_PRODUCTOS indica la cantidad máxima de objetos dentro del array
	}
	
	public void agregarProducto(Producto producto) {
		if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
			this.productos[this.contadorProductos++] = producto;
			//agrega un producto e y hace un post incremento en el arreglo, para asignarle
			//un nuevo índice al nuevo objeto tipo producto creado en este método.								
		}
		else {
			System.out.println("Se ha superado la cantidad maxima de productos" + Orden.MAX_PRODUCTOS);
		}
	}

	public double calcularTotal() {
		double total = 0;
		for (int i = 0; i < this.contadorProductos; i++) {
			Producto producto = this.productos[i];
			//Se obtiene el producto q se itera en i, y se pasa a la variable local "producto".
			total += producto.getPrecio(); //total = total + producto.getPrecio();
			//total += this.producto[i].getPrecio(); --> Forma corta de obtener el precio.		
		}
		return total;
		
	}
	
	public void mostrarOrden() {
		System.out.println("id Orden: " + this.idOrden);
		double totalOrden = this.calcularTotal();
		System.out.println("Total de la orden $:" + totalOrden);
		System.out.println("Productos de la orden: ");
		for (int i = 0; i < this.contadorProductos; i++) {
			System.out.println(this.productos[i]);
		}
	}
	
}
