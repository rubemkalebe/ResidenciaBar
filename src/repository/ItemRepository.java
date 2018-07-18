package repository;

import model.Item;

public class ItemRepository extends AbstractRepositoryJPA<Item> {

	public ItemRepository(Class<Item> persistentClass) {
		super(persistentClass);
		// TODO Auto-generated constructor stub
	}	
	
}
