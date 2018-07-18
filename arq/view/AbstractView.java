package view;

import java.util.List;

import controller.AbstractController;
import model.AbstractModelJPA;
import repository.AbstractRepository;
import repository.AbstractRepositoryJPA;

/**
 * Padrão para view.
 * 
 * @author rubemkalebe
 *
 * @param <T>
 */
public class AbstractView<T extends AbstractModelJPA> {

	/**
	 * 
	 */
	private AbstractRepository<T> repositoryAbstract;
	
	/**
	 * 
	 */
	private AbstractController<T> abstractController;
	
	/**
	 * 
	 */
	private Class<T> entity;
	
	/**
	 * 
	 */
	public AbstractView(Class<T> entity) {
		repositoryAbstract = new AbstractRepositoryJPA<T>(entity);
		abstractController = new AbstractController<T>(repositoryAbstract);
	}

	/**
	 * @return
	 */
	public AbstractController<T> getAbstractController() {
		return abstractController;
	}

	/**
	 * @param abstractController
	 */
	public void setAbstractController(AbstractController<T> abstractController) {
		this.abstractController = abstractController;
	}
	
	public Class<T> getEntity() {
		return entity;
	}

	public void setEntity(Class<T> entity) {
		this.entity = entity;
	}

	/**
	 * @return
	 */
	public List<T> fetchAll() {
		return this.abstractController.fetchAll();
	}
	
	/**
	 * @param id
	 * @return
	 */
	public T findById(int id) {
		return this.abstractController.findById(id);
	}
	
}
