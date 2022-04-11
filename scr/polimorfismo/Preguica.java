package polimorfismo;

public class Preguica extends Animal {
	@Override
	public void nome () {
		System.out.println("Nome da Pregui�a: Dona Pregui�a");
	}
	@Override
	public void idade () 
	{
		System.out.println("Idade da Pregui�a: 65 anos");
	}
	@Override
	public void emitirSom () 
	{
		System.out.println("Som da Pregui�a: zzzZZZZZZzzZ");
	}
	@Override
	public void executarAcao () 
	{
		System.out.println("A��o da Pregui�a: paradinha em um galho");
	}
}
