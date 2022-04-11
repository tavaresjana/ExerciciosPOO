package heranca;

public class AnimalCachorro extends HerancaAnimal {

	String correr, latir;
	int idade;
	
	public void nome(String nome) {
		this.nome=nome;
	}
	public void idade() {
		this.setIdade(2);
		System.out.println("Eu tenho "+getIdade()+" anos");
	}
	public void latir() {
		this.setSom(true);
		System.out.println("AU AU AU AU...");
	}
	public void correr() {
		this.setFaz(true);
		System.out.println("estou correndo atrás do meu rabo...");
	}
}