package controller;

import model.Pessoa;
import repository.AbstractRepository;

public class PessoaController extends AbstractController<Pessoa> {

	public PessoaController(AbstractRepository<Pessoa> repositoryAbstract) {
		super(repositoryAbstract);
	}

}
