package controller;

import model.ItemConta;
import repository.AbstractRepository;

public class ItemContaController extends AbstractController<ItemConta> {

	public ItemContaController(AbstractRepository<ItemConta> repositoryAbstract) {
		super(repositoryAbstract);
	}

}
