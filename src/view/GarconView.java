package view;

import model.Garcon;

public class GarconView extends AbstractView<Garcon> {

	public void addGarcon(int id, String nome, String matricula, double salario) {
		Garcon garcon = new Garcon();
		garcon.setId(id);
		garcon.setNome(nome);
		garcon.setMatricula(matricula);
		garcon.setSalario(salario);
		
		this.getAbstractController().add(garcon);
	}
	
}
