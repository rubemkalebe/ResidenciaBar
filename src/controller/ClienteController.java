package controller;

import model.Cliente;
import repository.AbstractRepository;

public class ClienteController extends AbstractController<Cliente> {

	public ClienteController(AbstractRepository<Cliente> repositoryAbstract) {
		super(repositoryAbstract);
	}
	
}
