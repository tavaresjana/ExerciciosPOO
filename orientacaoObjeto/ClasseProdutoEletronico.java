/*3) Crie uma classe produto eletr�nico e apresente os atributos e m�todos referentes esta classe, 
em seguida crie um objeto produto eletr�nico, defina as instancias deste objeto e apresente 
as informa��es deste objeto no console..*/

package AtividadesJava;

public class ClasseProdutoEletronico {

	// ATRIBUTOS -> CARACTER�STICAS
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

	// MET�DOS -> COMPORTAMENTOS
	public void ligar() // sempre o metodo tem parenteses na frente
	{
		if (carregado == false)
			System.out.println("O celular est� sem bateria e n�o pode ser ligado.");
		else
			System.out.println("O celular est� com bateria e pode ser ligado.");
	}

	public void ligado() {
		if (this.ligado == true)
			System.out.println("O celular est� ligado.");
		else
			System.out.println("O celular n�o est� ligado.");
	}

	public void ocupado() // sempre o metodo tem parenteses na frente
	{
		if (ocupado == true)
			System.out.println("O celular est� ocupado.");
	}

	public void estado() {
		System.out.println("O celular est� carregado? " + this.carregado);
		System.out.println("O celular est� ligado? " + this.ligado);
		System.out.println("O celular est� ocupado? " + this.ocupado);
	}
}