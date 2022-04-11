package orientacaoObjeto;

public class ObjetoProdutoEletronico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClasseProdutoEletronico p1 = new ClasseProdutoEletronico("Celular", "roxo");

		System.out.println("Informações do Produto\n");
		p1.ligar();
		p1.ligado();
		p1.ocupado();
		System.out.println();
		p1.estado();

	}

}
