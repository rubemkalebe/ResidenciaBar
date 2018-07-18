package repository;

import model.Pessoa;

public class PessoaRepository extends AbstractRepositoryJPA<Pessoa> {

	public PessoaRepository(Class<Pessoa> persistentClass) {
		super(persistentClass);
		// TODO Auto-generated constructor stub
	}

}
