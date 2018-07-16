package controller;

import model.Item;
import repository.AbstractRepository;

public class ItemController extends AbstractController<Item> {

	public ItemController(AbstractRepository<Item> repositoryAbstract) {
		super(repositoryAbstract);
	}
	
}
