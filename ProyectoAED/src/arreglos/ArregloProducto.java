package arreglos;

import java.util.ArrayList;

import clases.Producto;

public class ArregloProducto {

private ArrayList<Producto> producto;
	
	public ArregloProducto() {
		
		producto = new ArrayList<Producto>();
		adicionar(new Producto(2001, 53, 1, 100, "Gaseosa", 6.5));
		adicionar(new Producto(2002, 43, 1, 100, "Galleta", 2.5));
		adicionar(new Producto(2003, 28, 1, 100, "Yogurt", 4.5));
		adicionar(new Producto(2004, 10, 1, 100, "Fideos", 9.5));
		adicionar(new Producto(2005, 41, 1, 100, "Volt", 5));
		adicionar(new Producto(2006, 23, 1, 100, "Sporade", 2.5));
		adicionar(new Producto(2007, 18, 1, 100, "Doritos", 2.5));
		adicionar(new Producto(2008, 3, 1, 100, "Turron", 1.5));
	}
	
	public void adicionar(Producto p) {
		
		producto.add(p);
	}
	
	public int tamanio() {
		
		return producto.size();
	}
	
	public Producto obtener(int i) {
		
		return producto.get(i);
	}
	
	public void eliminar(int i) {
		
		producto.remove(i);
	}
	
	public Producto buscar(int codigo) {
		
		Producto p;
		
		for(int i = 0; i < tamanio(); i++) {
			
			p = obtener(i);
			
			if (p.getCodigoProducto() == codigo)
				return p;
		}
		
		return null;
	}
	
	public void eliminar(Producto p) {
		
		producto.remove(p);
	}
	
	public int codigoCorrelativo() {
		
		if(tamanio() == 0)
			
			return 1001;
		else
			
			return obtener(tamanio() - 1).getCodigoProducto() + 1;
	}
}
