package view;

import model.Mesa;

public class MesaView extends AbstractView<Mesa> {

	public void addMesa(int id, int numero) {
		Mesa mesa = new Mesa();
		mesa.setId(id);
		mesa.setNumero(numero);
		
		this.getAbstractController().add(mesa);
	}
	
}
