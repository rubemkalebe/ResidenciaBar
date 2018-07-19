package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Conta extends AbstractModelJPA {
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<ItemConta> itens;
	
	@OneToOne
	private Garcon garcon;
	
	@OneToOne
	private Cliente cliente;
	
	@OneToOne
	private Mesa mesa;

	public List<ItemConta> getItens() {
		return itens;
	}

	public void setItens(List<ItemConta> itens) {
		this.itens = itens;
	}

	public Garcon getGarcon() {
		return garcon;
	}

	public void setGarcon(Garcon garcon) {
		this.garcon = garcon;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	@Override
	public String toString() {
		double total = 0.0;
		for(ItemConta i : itens) {
			total += i.getValorTotal();
		}
		
		return "Conta [total=" + String.valueOf(total) + ", garcon=" + garcon + ", cliente=" + cliente + ", mesa=" + mesa + "]\n";
	}

}
