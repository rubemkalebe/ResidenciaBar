package repository;

import java.util.List;

import model.AbstractModelJPA;
import utils.DBConnection;

/**
 * Classe que fornece uma estrutura para persistência de dados usando JPA.
 * 
 * @author rubemkalebe
 *
 * @param <T> Tipo da Entidade
 */
public class AbstractRepositoryJPA<T extends AbstractModelJPA> 
				implements AbstractRepository<T> {

	private Class<T> persistentClass;
	
	private DBConnection conn;
	
	/**
	 * 
	 */
	public AbstractRepositoryJPA(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
		this.conn = new DBConnection();
	}
	
	/**
	 * Adiciona um elemento
	 * @param t Elemento a ser adicionado
	 */
	public void add(T t) {
		conn.getEntityManager().getTransaction().begin();
		conn.getEntityManager().persist(t);
		conn.getEntityManager().getTransaction().commit();
	}
	
	/**
	 * Remove um elemento
	 * @param t Elemento a ser removido
	 */
	public void remove(T t) {
		conn.getEntityManager().getTransaction().begin();
		conn.getEntityManager().remove(t);
		conn.getEntityManager().getTransaction().commit();
	}
	
	/**
	 * Retorna todos os objetos
	 * @return Todos os objetos
	 */
	@SuppressWarnings("unchecked")
	public List<T> fetchAll() {
		return conn.getEntityManager()
				.createQuery("SELECT x FROM " + this.persistentClass.getSimpleName() + " x")
				.getResultList();
	}
	
	/**
	 *
	 * @param id
	 * @return
	 */
	public T findById(int id) {
		T object = (T) this.conn.getEntityManager().find(this.persistentClass, id);
		return object;
	}
	
}
