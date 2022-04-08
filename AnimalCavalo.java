package ExercicioHeranca;

public class AnimalCavalo extends HerancaAnimal {

	String trotar, relinchar;
	int idade;
	
	public void nome(String nome) {
		this.nome=nome;
	}
	public void idade() {
		this.setIdade(1);
		System.out.println("Eu tenho "+getIdade()+" anos");
	}
	public void relinchar() {
		this.setSom(true);
		System.out.println("Iiiirrrrí!!!");
	}
	public void trotar() {
		this.setFaz(true);
		System.out.println("estou totando...");
	}
}