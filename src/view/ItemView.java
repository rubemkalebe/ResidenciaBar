package view;

import model.Item;

public class ItemView extends AbstractView<Item> {	
	
	public ItemView() {
		super(Item.class);
	}

	public void addItem(String desc, String marca, double valor) {
		Item item = new Item();
		item.setDescricao(desc);
		item.setMarca(marca);
		item.setValor(valor);
		
		this.getAbstractController().add(item);
	}
	
}
