package view;

import model.Cliente;

public class ClienteView extends AbstractView<Cliente> {

	public ClienteView() {
		super(Cliente.class);
	}

	public void addCliente(String nome, String cpf) {
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setCpf(cpf);
		
		this.getAbstractController().add(cliente);
	}
	
}
