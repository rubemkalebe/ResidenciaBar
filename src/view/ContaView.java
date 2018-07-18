package view;

import java.util.List;

import model.Cliente;
import model.Conta;
import model.Garcon;
import model.ItemConta;
import model.Mesa;

public class ContaView extends AbstractView<Conta> {

	public ContaView() {
		super(Conta.class);
	}

	public void addConta(List<ItemConta> itens, Garcon g, Cliente c, Mesa m) {
		Conta conta = new Conta();
		conta.setItens(itens);
		conta.setGarcon(g);
		conta.setMesa(m);
		
		this.getAbstractController().add(conta);
	}
	
}
