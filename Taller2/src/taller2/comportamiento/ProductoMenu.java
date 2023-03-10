package taller2.comportamiento;

import java.util.ArrayList;

public class ProductoMenu implements Producto {
	private String nombre;
	private int precioBase;
	
	public ProductoMenu(String nombre, int precioBase) 
	{
		this.nombre = nombre;
		this.precioBase = precioBase;
	}
	
	@Override
	public String getNombre() 
	{
		return this.nombre;
	}


	@Override
	public int getPrecio() 
	{
		return this.precioBase;	
	}

	@Override
	public String generarTextoFactura() 
	{
		return nombre + ": " + precioBase + "\n";
	}
}
