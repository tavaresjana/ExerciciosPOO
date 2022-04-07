/*3) Crie uma classe produto eletrônico e apresente os atributos e métodos referentes esta classe, 
em seguida crie um objeto produto eletrônico, defina as instancias deste objeto e apresente 
as informações deste objeto no console..*/

package AtividadesJava;

public class ClasseProdutoEletronico {

	// ATRIBUTOS -> CARACTERÍSTICAS
	String produto; // caracteristica
	String cor; // caracteristica
	boolean carregado; // estado
	boolean ligado; // comportamento
	boolean ocupado;

	// METODO CONSTRUTOR
	public ClasseProdutoEletronico(String p, String c) {
		this.produto = p;
		this.cor = c;
		this.carregado = true;
		this.ligado = false;
		this.ocupado = false;
	}

	// METÓDOS -> COMPORTAMENTOS
	public void ligar() // sempre o metodo tem parenteses na frente
	{
		if (carregado == false)
			System.out.println("O celular está sem bateria e não pode ser ligado.");
		else
			System.out.println("O celular está com bateria e pode ser ligado.");
	}

	public void ligado() {
		if (this.ligado == true)
			System.out.println("O celular está ligado.");
		else
			System.out.println("O celular não está ligado.");
	}

	public void ocupado() // sempre o metodo tem parenteses na frente
	{
		if (ocupado == true)
			System.out.println("O celular está ocupado.");
	}

	public void estado() {
		System.out.println("O celular está carregado? " + this.carregado);
		System.out.println("O celular está ligado? " + this.ligado);
		System.out.println("O celular está ocupado? " + this.ocupado);
	}
}