package main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import model.Cliente;
import model.Garcon;
import model.ItemConta;
import model.Mesa;
import view.ClienteView;
import view.ContaView;
import view.GarconView;
import view.ItemView;
import view.MesaView;

public class Main {

	private static ItemView itemView = new ItemView();
	private static GarconView garconView = new GarconView();
	private static MesaView mesaView = new MesaView();
	private static ClienteView clienteView = new ClienteView();
	private static ContaView contaView = new ContaView();
	
	public static void main(String[] args) {
		int option;
	
		do {
			option = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção\n"
					+ "1 - Adicionar Item\n"
					+ "2 - Adicionar Garçon\n"
					+ "3 - Adicionar Mesa\n"
					+ "4 - Adicionar Cliente\n"
					+ "5 - Adicionar Conta\n"
					+ "0 - Sair"));
			
			switch (option) {
			case 1:
				addItem();
				break;
				
			case 2:
				addGarcon();
				break;
				
			case 3:
				addMesa();
				break;
				
			case 4:
				addCliente();
				break;
				
			case 5:
				addConta();
				break;

			default:
				break;
			}
		} while(option != 0);
		
	}
	
	public static void addItem() {
		itemView.addItem(
				JOptionPane.showInputDialog("Descrição do item"),
				JOptionPane.showInputDialog("Marca do item"),
				Double.parseDouble(JOptionPane.showInputDialog("Valor do item"))
		);
		JOptionPane.showMessageDialog(null, itemView.getAbstractController().fetchAll());
	}
	
	public static void addGarcon() {
		garconView.addGarcon(
				JOptionPane.showInputDialog("Nome do garçon"),
				JOptionPane.showInputDialog("CPF do cliente"),
				JOptionPane.showInputDialog("Matrícula do garçon"),
				Double.parseDouble(JOptionPane.showInputDialog("Salário"))
		);
		JOptionPane.showMessageDialog(null, garconView.getAbstractController().fetchAll());
	}
	
	public static void addMesa() {
		mesaView.addMesa(
				Integer.parseInt(JOptionPane.showInputDialog("Número da mesa"))
		);
		JOptionPane.showMessageDialog(null, mesaView.getAbstractController().fetchAll());
	}
	
	public static void addCliente() {
		clienteView.addCliente(
				JOptionPane.showInputDialog("Nome do cliente"),
				JOptionPane.showInputDialog("CPF do cliente")
		);
		JOptionPane.showMessageDialog(null, clienteView.getAbstractController().fetchAll());
	}
	
	public static void addConta() {
		Garcon g = garconView.findById(Integer.parseInt(JOptionPane.showInputDialog("Id do Garcon")));
		Cliente c = clienteView.findById(Integer.parseInt(JOptionPane.showInputDialog("Id do Cliente")));
		Mesa m = mesaView.findById(Integer.parseInt(JOptionPane.showInputDialog("Id da Mesa")));
		
		List<ItemConta> itens = new ArrayList<ItemConta>();
		String itensStr = "";
		do {
			itensStr = JOptionPane.showInputDialog("Entre com os itens no formato itemID-quantidade\n"
					+ "Deixe em branco e confirme para finalizar a adição de itens");
			
			if(!(itensStr.length() > 0)) break;
			
			ItemConta itemConta = new ItemConta();
			String[] l = itensStr.split("-");
			
			itemConta.setItem(itemView.findById(Integer.parseInt(l[0])));
			itemConta.setQuantidade(Integer.parseInt(l[1]));
			itens.add(itemConta);
		} while(true);
		
		contaView.addConta(itens, g, c, m);
		
		JOptionPane.showMessageDialog(null, contaView.getAbstractController().fetchAll());
	}

}
