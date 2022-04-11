package collection;

/*Crie uma um programa para trabalhar com estoque de uma loja, o programa dever� 
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o programa dever� atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/
import java.util.ArrayList;

public class TesteCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExercicioCollection f1 = new ExercicioCollection("Ma��", 50);
		ExercicioCollection f2 = new ExercicioCollection("P�ra", 51);
		ExercicioCollection f3 = new ExercicioCollection("Kiwi", 52);
		ExercicioCollection f4 = new ExercicioCollection("Maracuj�", 53);
		ExercicioCollection f5 = new ExercicioCollection("Mam�o", 54);

		ArrayList<ExercicioCollection> frutas = new ArrayList<>();

		frutas.add(f1);
		frutas.add(f2);
		frutas.add(f3);
		frutas.add(f4);
		frutas.add(f5);

		System.out.println(frutas); // imprime as frutas
		System.out.println("Temos " + frutas.size() + " tipos de frutas diferentes"); // quantidade de tipos de frutas
		frutas.remove(3); // removendo uma fruta
		System.out.println(frutas + " O Maracuj� acabou. Vou ficar devendo!");
		frutas.clear(); // removendo dados
		System.out.println(frutas);

	}

}
