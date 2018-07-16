package controller;

import java.util.List;

import repository.AbstractRepository;

/**
 * Fornece uma estrutura para ações sobre entidades.
 * 
 * @author rubemkalebe
 *
 * @param <T> Tipo da Entidade
 */
public class AbstractController<T> {

	/**
	 * Repositório de dados
	 */
	private AbstractRepository<T> repositoryAbstract;
	
	/**
	 * @param repositoryAbstract Repositório de dados
	 */
	public AbstractController(AbstractRepository<T> repositoryAbstract) {
		this.repositoryAbstract = repositoryAbstract;
	}
	
	/**
	 * 
	 * @param t Elemento a ser adicionado
	 */
	public void add(T t) {
		repositoryAbstract.add(t);
	}
	
	/**
	 * @param t Elemento a ser removido
	 */
	public void remove(T t) {
		repositoryAbstract.remove(t);
	}
	
	/**
	 * @param old
	 * @param t
	 */
	public void update(T old, T t) {
		repositoryAbstract.remove(old);
		repositoryAbstract.add(t);
	}
	
	/**
	 * @return Todos os elementos
	 */
	public List<T> fetchAll() {
		return repositoryAbstract.fetchAll();
	}
	
	/**
	 * @param id
	 * @return
	 */
	public T findById(int id) {
		return repositoryAbstract.findById(id);
	}
}
