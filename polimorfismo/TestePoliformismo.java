package ExercicioPolimorfismo;

public class TestePoliformismo {
	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		dog.nome();
		dog.idade();
		dog.emitirSom();
		dog.executarAcao();
		System.out.println("");
		
		Cavalo cav = new Cavalo();
		cav.nome();
		cav.idade();
		cav.emitirSom();
		cav.executarAcao();
		System.out.println("");
		
		Preguica p = new Preguica ();
		p.nome();
		p.idade();
		p.emitirSom();
		p.executarAcao();
		

	}

}
