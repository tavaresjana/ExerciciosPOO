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
		System.out.println("A��o do Cachorro: correndo atr�s do pr�prio rabo");
	}
}
