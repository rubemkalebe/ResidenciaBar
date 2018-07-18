package model;

import javax.persistence.Entity;

@Entity
public class Mesa extends AbstractModelJPA{

	private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mesa other = (Mesa) obj;
		if (numero != other.numero)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Mesa [numero=" + numero + "]";
	}

}
