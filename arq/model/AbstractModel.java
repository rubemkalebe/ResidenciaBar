package model;

/**
 * Classe para padronizar todas as entidades do sistema.
 * 
 * @author rubemkalebe
 *
 */
public class AbstractModel {

	/**
	 * Identificador
	 */
	private int id;

	/**
	 * 
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * 
	 * @param id Novo identificador
	 */
	public void setId(int id) {
		this.id = id;
	}
	
}
