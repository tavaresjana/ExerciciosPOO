package orientacaoObjeto;

public class ClasseFuncionario {
	//ATRIBUTOS -> CARACTERÍSTICAS
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
		
	//METÓDOS -> COMPORTAMENTOS
		public void trabalhar() 
		{
			if (trabalhando==true)
				System.out.println("O funcionário está trabalhando"); 
			
			else
				System.out.println("O funcionário não está trabalhando");
		}
		
		public void tirarFerias() 
		{
			if (ferias==true)
				System.out.println("O funcionário está de férias e não pode trabalhar");
			else
				System.out.println("O funcionário não está de férias e pode trabalhar");
		}
		
		public void executar ()
		{
			if (parado==true) 
				System.out.println("O funcionário pode trabalhar, pois não está executando tarefas no momento");
			else if (parado==false)
				System.out.println("O funcionário está ocupado executando outras tarefas");
			else if (ferias==true)
				System.out.println("o funcionario não pode trabalhar, pois está de férias");
		}
		
		public void estado()
		{
			System.out.println("Nome do funcionário: "+this.nome);
			System.out.println("Funcionário trabalha no setor: "+this.setor);
			System.out.println("Funcionário está trabalhando?: "+this.trabalhando);
			System.out.println("O funcionário está de férias? "+this.ferias); 
			System.out.println("O funcionario pode trabalhar no momento? "+this.parado);
		}
}
