package view;

import model.Cliente;

public class ClienteView extends AbstractView<Cliente> {

	public void addCliente(int id, String nome, String cpf) {
		Cliente cliente = new Cliente();
		cliente.setId(id);
		cliente.setNome(nome);
		cliente.setCpf(cpf);
		
		this.getAbstractController().add(cliente);
	}
	
}
