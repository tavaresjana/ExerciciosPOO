package AtividadesJava;

import java.util.Scanner; 

public class ObjetoFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClasseFuncionario func1 = new ClasseFuncionario("Maria","RH - Recursos Humanos");
		

		System.out.println("Informações do Produto\n");
		func1.trabalhar();
		func1.tirarFerias();
		func1.executar();
		System.out.println();
		func1.estado();
		
	}

}
