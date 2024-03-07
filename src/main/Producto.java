package main;

public class Producto {
	private float precio;
	private String nombre;
	private String desc;
	
	
	public Producto(float precio, String nombre, String desc) {
		super();
		this.precio = precio;
		this.nombre = nombre;
		this.desc = desc;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String toString() {
		return "\n[Nombre]: "+this.nombre+"; "+"[Precio]: "+this.precio+"; "+"[Descripcion]: "+this.desc+"\n";	
	}
}
