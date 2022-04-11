package orientacaoObjeto;

public class ClasseFuncionario {
	//ATRIBUTOS -> CARACTER�STICAS
		String nome; //caracteristicas
		String setor; //caracteristicas
		boolean trabalhando; //comportamento
		boolean parado; //comportamento
		boolean ferias; //estado

	//METODO CONSTRUTOR 
		public ClasseFuncionario(String n, String s)
		{
			this.nome=n; 
			this.setor=s;
			this.trabalhando=true;
			this.parado=true;
			this.ferias=false;
		}
		
	//MET�DOS -> COMPORTAMENTOS
		public void trabalhar() 
		{
			if (trabalhando==true)
				System.out.println("O funcion�rio est� trabalhando"); 
			
			else
				System.out.println("O funcion�rio n�o est� trabalhando");
		}
		
		public void tirarFerias() 
		{
			if (ferias==true)
				System.out.println("O funcion�rio est� de f�rias e n�o pode trabalhar");
			else
				System.out.println("O funcion�rio n�o est� de f�rias e pode trabalhar");
		}
		
		public void executar ()
		{
			if (parado==true) 
				System.out.println("O funcion�rio pode trabalhar, pois n�o est� executando tarefas no momento");
			else if (parado==false)
				System.out.println("O funcion�rio est� ocupado executando outras tarefas");
			else if (ferias==true)
				System.out.println("o funcionario n�o pode trabalhar, pois est� de f�rias");
		}
		
		public void estado()
		{
			System.out.println("Nome do funcion�rio: "+this.nome);
			System.out.println("Funcion�rio trabalha no setor: "+this.setor);
			System.out.println("Funcion�rio est� trabalhando?: "+this.trabalhando);
			System.out.println("O funcion�rio est� de f�rias? "+this.ferias); 
			System.out.println("O funcionario pode trabalhar no momento? "+this.parado);
		}
}
