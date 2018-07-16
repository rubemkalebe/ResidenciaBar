package controller;

import model.Garcon;
import repository.AbstractRepository;

public class GarconController extends AbstractController<Garcon> {

	public GarconController(AbstractRepository<Garcon> repositoryAbstract) {
		super(repositoryAbstract);
	}
	
}
