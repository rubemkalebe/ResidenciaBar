package repository;

import java.util.ArrayList;
import java.util.List;

import model.AbstractModel;

/**
 * Classe que fornece uma estrutura para persistência de dados.
 * 
 * @author rubemkalebe
 *
 * @param <T> Tipo da Entidade
 */
public class AbstractRepository<T> {

	/**
	 * Lista encadeada genérica
	 */
	private List<T> objects;
	
	
	/**
	 * Inicializa a lista encadeada
	 */
	public AbstractRepository() {
		this.objects = new ArrayList<T>();
	}
	
	/**
	 * Adiciona um elemento a lista
	 * @param t Elemento a ser adicionado
	 */
	public void add(T t) {
		this.objects.add(t);
	}
	
	/**
	 * Remove um elemento da lista
	 * @param t Elemento a ser removido
	 */
	public void remove(T t) {
		this.objects.remove(t);
	}
	
	/**
	 * Retorna todos os objetos da lista
	 * @return Todos os objetos
	 */
	public List<T> fetchAll() {
		return this.objects;
	}
	
	/**
	 *
	 * @param id
	 * @return
	 */
	public T findById(int id) {
		for(T t : this.objects) {
			if(((AbstractModel) t).getId() == id) {
				return t;
			}
		}
		return null;
	}
	
}
