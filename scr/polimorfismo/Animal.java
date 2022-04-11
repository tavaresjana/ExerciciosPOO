package polimorfismo;

public abstract class Animal {

	private String nome;
	private int idade;
	private String som;
	private String acao;
	
	public void nome () 
	{
		System.out.println("nome de animal");
	}
	public void idade () 
	{
		System.out.println("idade do animal");
	}
	public void emitirSom () 
	{
		System.out.println("som do animal");
	}
	public void executarAcao () 
	{
		System.out.println("ação do animal");
	}
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
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public String getAcao() {
		return acao;
	}
	public void setAcao(String acao) {
		this.acao = acao;
	}
}
