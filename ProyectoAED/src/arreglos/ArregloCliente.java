package arreglos;

import java.util.ArrayList;
import clases.Cliente;

public class ArregloCliente {
	
	private ArrayList<Cliente> cliente;
	
	public ArregloCliente() {
		
		cliente = new ArrayList<Cliente>();
	}
	
	public void adicionar(Cliente c) {
		
		cliente.add(c);
	}
	
	public int tamanio() {
		
		return cliente.size();
	}
	
	public Cliente obtener(int i) {
		
		return cliente.get(i);
	}
	
	public int codigoCorrelativo() {
		
		if(tamanio() == 0)
			
			return 1001;
		else
			
			return obtener(tamanio() - 1).getCodigoCliente();
	}
}
