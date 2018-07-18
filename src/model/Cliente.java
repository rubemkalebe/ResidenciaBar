package model;

import javax.persistence.Entity;

@Entity
public class Cliente extends Pessoa {

	private String cartaoFidelidade;
	
	private String credito;

	public String getCartaoFidelidade() {
		return cartaoFidelidade;
	}

	public void setCartaoFidelidade(String cartaoFidelidade) {
		this.cartaoFidelidade = cartaoFidelidade;
	}

	public String getCredito() {
		return credito;
	}

	public void setCredito(String credito) {
		this.credito = credito;
	}
	
	@Override
	public String toString() {
		return "Cliente [getNome()=" + getNome() + ", getCpf()=" + getCpf() + "]";
	}
	
}
