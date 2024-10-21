package arreglos;

import java.util.ArrayList;
import clases.Cliente;

public class ArregloCliente {
	
	private ArrayList<Cliente> cliente;
	
	public ArregloCliente() {
		
		cliente = new ArrayList<Cliente>();
		adicionar(new Cliente(1001, "Javier", "Loayza", "Av Paquita 125", "976325405", "70258473"));
		adicionar(new Cliente(1002, "Lindsay", "Bustios", "Jr Capulies 159", "981342067", "69753810"));
		adicionar(new Cliente(1003, "Raul", "Vidal", "Av Boulogne 3510", "986418732", "71594326"));
		adicionar(new Cliente(1004, "Alonso", "Cardenas", "Jr Tulipanes", "956401890", "29430687"));
		adicionar(new Cliente(1005, "Diana", "Tacunan", "Av Abancay 5315", "938764897", "49783051"));
		adicionar(new Cliente(1006, "Jordan", "Escalante", "Psj Belen 215", "996871534", "61185498"));
		adicionar(new Cliente(1007, "Fiorella", "Contreras", "Jr Giraldez 1009", "973168795", "71594326"));
		adicionar(new Cliente(1008, "Mayra", "Quesada", "Av Tarapaca 139", "913487650", "23849675"));
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

	public void eliminar(int i) {
		
		cliente.remove(i);
	}
	
	public int codigoCorrelativo() {
		
		if(tamanio() == 0)
			
			return 1001;
		else
			
			return obtener(tamanio() - 1).getCodigoCliente();
	}
}
