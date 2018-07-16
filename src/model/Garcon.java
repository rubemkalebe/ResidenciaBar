package model;

public class Garcon extends Pessoa {

	private String matricula;
	
	private double salario;
	
	private String carteiraTrabalho;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCarteiraTrabalho() {
		return carteiraTrabalho;
	}

	public void setCarteiraTrabalho(String carteiraTrabalho) {
		this.carteiraTrabalho = carteiraTrabalho;
	}

	@Override
	public String toString() {
		return "Garcon [matricula=" + matricula + ", getNome()=" + getNome() + "]";
	}
	
}
