package collection;

/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá 
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o programa deverá atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/
import java.util.ArrayList;

public class TesteCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExercicioCollection f1 = new ExercicioCollection("Maçã", 50);
		ExercicioCollection f2 = new ExercicioCollection("Pêra", 51);
		ExercicioCollection f3 = new ExercicioCollection("Kiwi", 52);
		ExercicioCollection f4 = new ExercicioCollection("Maracujá", 53);
		ExercicioCollection f5 = new ExercicioCollection("Mamão", 54);

		ArrayList<ExercicioCollection> frutas = new ArrayList<>();

		frutas.add(f1);
		frutas.add(f2);
		frutas.add(f3);
		frutas.add(f4);
		frutas.add(f5);

		System.out.println(frutas); // imprime as frutas
		System.out.println("Temos " + frutas.size() + " tipos de frutas diferentes"); // quantidade de tipos de frutas
		frutas.remove(3); // removendo uma fruta
		System.out.println(frutas + " O Maracujá acabou. Vou ficar devendo!");
		frutas.clear(); // removendo dados
		System.out.println(frutas);

	}

}
