package model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Classe para padronizar todas as entidades do sistema que usarão JPA.
 * 
 * @author rubemkalebe
 *
 */
@MappedSuperclass
public class AbstractModelJPA {

	/**
	 * Identificador
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
