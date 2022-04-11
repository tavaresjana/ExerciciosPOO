package polimorfismo;

public class Preguica extends Animal {
	@Override
	public void nome () {
		System.out.println("Nome da Preguiça: Dona Preguiça");
	}
	@Override
	public void idade () 
	{
		System.out.println("Idade da Preguiça: 65 anos");
	}
	@Override
	public void emitirSom () 
	{
		System.out.println("Som da Preguiça: zzzZZZZZZzzZ");
	}
	@Override
	public void executarAcao () 
	{
		System.out.println("Ação da Preguiça: paradinha em um galho");
	}
}
