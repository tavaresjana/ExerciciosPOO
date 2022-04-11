package ExercicioPolimorfismo;

public class Cachorro extends Animal {
	@Override
	public void nome () {
		System.out.println("Nome do Cachorro: Black");
	}
	@Override
	public void idade () 
	{
		System.out.println("Idade do Cachorro: 2 anos");
	}
	@Override
	public void emitirSom () 
	{
		System.out.println("Som do Cachorro: AUAUAUAU");
	}
	@Override
	public void executarAcao () 
	{
		System.out.println("Ação do Cachorro: correndo atrás do próprio rabo");
	}
}
