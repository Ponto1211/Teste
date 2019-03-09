package entidade;

public class Empregados {

	int id;
	String nome;
	Double salario;

	public Empregados(int id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}

	public void SetSalario(double novoSalario) {
		this.salario = novoSalario;
	}

	public void aumentoSalarial(double aumento) {
		salario += (aumento * salario) / 100;
	}

	public String toString() {
		return id+", "+ nome + ", " + salario;
	}

}
