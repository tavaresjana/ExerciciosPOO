package polimorfismo;

public class Cavalo extends Animal {
	@Override
	public void nome () {
		System.out.println("Nome do Cavalo: Pé de Pano");
	}
	@Override
	public void idade () 
	{
		System.out.println("Idade do Cavalo: 15 anos");
	}
	@Override
	public void emitirSom () 
	{
		System.out.println("Som do Cavalo: Iiiiiirííí");
	}
	@Override
	public void executarAcao () 
	{
		System.out.println("Ação do Cavalo: glopando nos campos");
	}
	
}
