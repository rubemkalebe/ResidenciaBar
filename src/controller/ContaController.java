package controller;

import model.Conta;
import repository.AbstractRepository;

public class ContaController extends AbstractController<Conta> {

	public ContaController(AbstractRepository<Conta> repositoryAbstract) {
		super(repositoryAbstract);
	}

}
