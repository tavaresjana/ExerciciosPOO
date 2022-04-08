package ExercicioHeranca;

public class AnimalPreguica {

	String dormir, barulho;
	int idade;
	private String nome;
	
	public void nome(String nome) {
		this.setNome(nome);
	}
	public void idade() {
		this.setIdade(1);
		System.out.println("Eu tenho "+getIdade()+" anos");
	}
	private void setIdade(int i) {
		// TODO Auto-generated method stub
		
	}
	private String getIdade() {
		// TODO Auto-generated method stub
		return null;
	}
	public void barulho() {
		this.setSom(true);
		System.out.println("Iiiirrrrí!!!");
	}
	private void setSom(boolean b) {
		// TODO Auto-generated method stub
		
	}
	public void dormir() {
		this.setFaz(true);
		System.out.println("estou dormindo...");
	}
	private void setFaz(boolean b) {
		// TODO Auto-generated method stub
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}