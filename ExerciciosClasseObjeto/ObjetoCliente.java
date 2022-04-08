package AtividadesJava;

public class ObjetoCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClasseCliente c1 = new ClasseCliente("Maria de Jesus", "feminino", "Rua Flores de Maio, nº 19", 25);
		ClasseCliente c2 = new ClasseCliente("João Carlos", "masculino", "Rua Águas de Março, nº 03", 26);

		c1.comprar = true;
		c1.dinheiro = true;
		c1.gostar = false;
		c1.estado();
		System.out.println();

		c2.comprar = false;
		c2.dinheiro = false;
		c2.gostar = false;
		c2.estado();
		System.out.println();

	}
}