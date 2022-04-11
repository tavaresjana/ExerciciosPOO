package heranca;

public class TesteHeranca {

	public static void main(String[] args) {
		// AnimalCachorroTeste
		AnimalCachorro c = new AnimalCachorro();
		c.nome = ("BlackIce");
		c.idade = 2;
		c.correr = "correndo atrás do meu rabinho...";
		c.latir = ("AU AU AU AU AU!!! ");

		System.out.println("Eu sou um cachorro e meu nome é " + c.nome);
		System.out.println("Eu tenho " + c.idade + " meses de vida");
		System.out.println("O barulho que eu faço é " + c.latir);
		System.out.println("Agora estou " + c.correr);
		System.out.println("\n");

		// AnimalCavaloTeste
		AnimalCavalo cv = new AnimalCavalo();
		cv.nome = ("Pé de Pano");
		cv.idade = 5;
		cv.trotar = "galopando por aí...";
		cv.relinchar = ("Iiiiirí!!!");

		System.out.println("Eu sou um cavalo e meu nome é " + cv.nome);
		System.out.println("Eu tenho " + cv.idade + " anos");
		System.out.println("O barulho que eu faço é " + cv.relinchar);
		System.out.println("Agora estou " + cv.trotar);
		System.out.println("\n");

		// AnimalPreguiçaTeste
		AnimalPreguica p = new AnimalPreguica();
		p.setNome(("Dona Preguiça"));
		p.idade = 52;
		p.dormir = "paradinha em um galho...";
		p.barulho = ("Xiii, silêncio!");

		System.out.println("Eu sou uma preguiça e meu nome é " + p.getNome());
		System.out.println("Eu tenho " + p.idade + " anos");
		System.out.println("Tenho preguiça de fazer barulho. " + p.barulho);
		System.out.println("Agora estou " + p.dormir);

	}
}
