package heranca;

public class TesteHeranca {

	public static void main(String[] args) {
		// AnimalCachorroTeste
		AnimalCachorro c = new AnimalCachorro();
		c.nome = ("BlackIce");
		c.idade = 2;
		c.correr = "correndo atr�s do meu rabinho...";
		c.latir = ("AU AU AU AU AU!!! ");

		System.out.println("Eu sou um cachorro e meu nome � " + c.nome);
		System.out.println("Eu tenho " + c.idade + " meses de vida");
		System.out.println("O barulho que eu fa�o � " + c.latir);
		System.out.println("Agora estou " + c.correr);
		System.out.println("\n");

		// AnimalCavaloTeste
		AnimalCavalo cv = new AnimalCavalo();
		cv.nome = ("P� de Pano");
		cv.idade = 5;
		cv.trotar = "galopando por a�...";
		cv.relinchar = ("Iiiiir�!!!");

		System.out.println("Eu sou um cavalo e meu nome � " + cv.nome);
		System.out.println("Eu tenho " + cv.idade + " anos");
		System.out.println("O barulho que eu fa�o � " + cv.relinchar);
		System.out.println("Agora estou " + cv.trotar);
		System.out.println("\n");

		// AnimalPregui�aTeste
		AnimalPreguica p = new AnimalPreguica();
		p.setNome(("Dona Pregui�a"));
		p.idade = 52;
		p.dormir = "paradinha em um galho...";
		p.barulho = ("Xiii, sil�ncio!");

		System.out.println("Eu sou uma pregui�a e meu nome � " + p.getNome());
		System.out.println("Eu tenho " + p.idade + " anos");
		System.out.println("Tenho pregui�a de fazer barulho. " + p.barulho);
		System.out.println("Agora estou " + p.dormir);

	}
}
