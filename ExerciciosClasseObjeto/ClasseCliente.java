/*1) Crie uma classe cliente e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto cliente, 
defina as instancias deste objeto e apresente as informa��es deste objeto no console.*/

package AtividadesJava;

public class ClasseCliente {
//ATRIBUTOS -> CARACTER�STICAS
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
	
//MET�DOS -> COMPORTAMENTOS
	
	public void comprar () 
	{
		if (comprar==true)
			System.out.println("O cliente deseja comprar");
		else
			System.out.println("O cliente n�o deseja comprar");
	}
	
	public void pagar ()
	{
		if (dinheiro==true)  
			System.out.println("O cliente ir� pagar usando dinheiro em esp�cie");
		else 
			System.out.println("O cliente n�o pagar� usando dinheiro em esp�cie");
	}
	
	public void gostar ()
	{
		if(gostar==false)
			System.out.println("O cliente n�o est� satisfeito e n�o voltar� mais a loja.");
		else
			System.out.println("O cliente est� satisfeito e comprar� novamente na loja");
	}

	public void estado()
	{
		System.out.println("Nome do cliente: "+this.nome);
		System.out.println("Sexo: "+this.sexo);
		System.out.println("Endere�o: "+this.endereco);
		System.out.println("Idade do cliente: "+this.idade);
		System.out.println("O cliente deseja comprar algo? "+this.comprar);
		System.out.println("O cliente pagou? "+this.dinheiro);
		System.out.println("O cliente est� satisfeito? "+this.gostar);
	}
}
