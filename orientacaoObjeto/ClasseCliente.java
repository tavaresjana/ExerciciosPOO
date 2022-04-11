/*1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto cliente, 
defina as instancias deste objeto e apresente as informações deste objeto no console.*/

package AtividadesJava;

public class ClasseCliente {
//ATRIBUTOS -> CARACTERÍSTICAS
	String nome, endereco, sexo; 
	int idade; 
	boolean dinheiro;
	boolean comprar;
	boolean gostar;

//METODO CONSTRUTOR 
	public ClasseCliente(String n, String sexo, String ed, int id)
	{
		this.nome=n;
		this.sexo=sexo;
		this.endereco=ed;
		this.idade= id;
		this.dinheiro=true; 
		this.comprar=true; 
		this.gostar=true; 		
	}
	
//METÓDOS -> COMPORTAMENTOS
	
	public void comprar () 
	{
		if (comprar==true)
			System.out.println("O cliente deseja comprar");
		else
			System.out.println("O cliente não deseja comprar");
	}
	
	public void pagar ()
	{
		if (dinheiro==true)  
			System.out.println("O cliente irá pagar usando dinheiro em espécie");
		else 
			System.out.println("O cliente não pagará usando dinheiro em espécie");
	}
	
	public void gostar ()
	{
		if(gostar==false)
			System.out.println("O cliente não está satisfeito e não voltará mais a loja.");
		else
			System.out.println("O cliente está satisfeito e comprará novamente na loja");
	}

	public void estado()
	{
		System.out.println("Nome do cliente: "+this.nome);
		System.out.println("Sexo: "+this.sexo);
		System.out.println("Endereço: "+this.endereco);
		System.out.println("Idade do cliente: "+this.idade);
		System.out.println("O cliente deseja comprar algo? "+this.comprar);
		System.out.println("O cliente pagou? "+this.dinheiro);
		System.out.println("O cliente está satisfeito? "+this.gostar);
	}
}
