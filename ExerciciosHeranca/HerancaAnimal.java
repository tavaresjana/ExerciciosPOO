package ExercicioHeranca;

public class HerancaAnimal {

	// VARI�VEIS
	protected String nome;
	private int idade;
	private boolean som;
	private boolean faz;
	
	// M�TODO ACESSORES E MODIFICADORES
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public boolean isSom() {
		return som;
	}
	public void setSom(boolean som) {
		this.som = som;
	}
	public boolean isFaz() {
		return faz;
	}
	public void setFaz(boolean faz) {
		this.faz = faz;
	}
}	