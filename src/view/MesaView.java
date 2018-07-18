package view;

import model.Mesa;

public class MesaView extends AbstractView<Mesa> {

	public MesaView() {
		super(Mesa.class);
	}
	
	public void addMesa(int numero) {
		Mesa mesa = new Mesa();
		mesa.setNumero(numero);
		
		this.getAbstractController().add(mesa);
	}
	
}
