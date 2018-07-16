package view;

import java.util.List;

import controller.AbstractController;
import repository.AbstractRepository;

/**
 * Padrão para view.
 * 
 * @author rubemkalebe
 *
 * @param <T>
 */
public class AbstractView<T> {

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
	public AbstractView() {
		repositoryAbstract = new AbstractRepository<T>();
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
