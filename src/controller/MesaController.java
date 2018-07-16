package controller;

import model.Mesa;
import repository.AbstractRepository;

public class MesaController extends AbstractController<Mesa> {

	public MesaController(AbstractRepository<Mesa> repositoryAbstract) {
		super(repositoryAbstract);
	}
	
}
