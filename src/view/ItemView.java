package view;

import model.Item;

public class ItemView extends AbstractView<Item> {	
	
	public void addItem(int id, String desc, String marca, double valor) {
		Item item = new Item();
		item.setId(id);
		item.setDescricao(desc);
		item.setMarca(marca);
		item.setValor(valor);
		
		this.getAbstractController().add(item);
	}
	
}
