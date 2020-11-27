package cl.alley.ventas;

public class Producto {
	
	//Atributos
	
	private final int idProducto;
	private String nombre;
	private double precio;
	private static int contadorProductos;
	
	//Constructores
	
	private Producto() {
		this.idProducto = ++Producto.contadorProductos; 
		//Inicializa el id producto y agrega un contador
	}

	public Producto(String nombre, double precio) {
		this(); //llama al contructor vacío de Producto
		this.nombre = nombre;
		this.precio = precio;
	}
	
	//Gets & Sets

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getIdProducto() {
		return idProducto;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	//toString
	
	
	

	
	

}
