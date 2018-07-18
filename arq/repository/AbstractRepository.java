package repository;

import java.util.List;

/**
 * Classe que fornece uma estrutura para persistência de dados.
 * 
 * @author rubemkalebe
 *
 * @param <T> Tipo da Entidade
 */
public interface AbstractRepository<T> {
	
	
	/**
	 * Adiciona um elemento
	 * @param t Elemento a ser adicionado
	 */
	public void add(T t);
	
	/**
	 * Remove um elemento
	 * @param t Elemento a ser removido
	 */
	public void remove(T t);
	
	/**
	 * Retorna todos os objetos da lista
	 * @return Todos os objetos
	 */
	public List<T> fetchAll();
	
	/**
	 *
	 * @param id
	 * @return
	 */
	public T findById(int id);
	
}
