package model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class ItemConta extends AbstractModelJPA {
	
	@ManyToOne
	private Conta conta;
	
	@OneToOne
	private Item item;
	
	private int quantidade;

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getValorTotal() {
		return quantidade * item.getValor();
	}

	@Override
	public String toString() {
		return "ItemConta [conta=" + conta + ", item=" + item + ", quantidade=" + quantidade + "]";
	}
}
