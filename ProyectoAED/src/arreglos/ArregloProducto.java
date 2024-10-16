package arreglos;

import java.util.ArrayList;

import clases.Producto;

public class ArregloProducto {

private ArrayList<Producto> producto;
	
	public ArregloProducto() {
		
		producto = new ArrayList<Producto>();
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
	
	public int codigoCorrelativo() {
		
		if(tamanio() == 0)
			
			return 1001;
		else
			
			return obtener(tamanio() - 1).getCodigoProducto() + 1;
	}
}
