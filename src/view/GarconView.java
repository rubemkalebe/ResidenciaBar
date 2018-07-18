package view;

import model.Garcon;

public class GarconView extends AbstractView<Garcon> {

	public GarconView() {
		super(Garcon.class);
	}

	public void addGarcon(String nome, String matricula, double salario) {
		Garcon garcon = new Garcon();
		garcon.setNome(nome);
		garcon.setMatricula(matricula);
		garcon.setSalario(salario);
		
		this.getAbstractController().add(garcon);
	}
	
}
