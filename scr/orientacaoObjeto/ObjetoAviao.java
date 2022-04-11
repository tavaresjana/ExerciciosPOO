package orientacaoObjeto;

public class ObjetoAviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClasseAviao aviao = new ClasseAviao("Boeing", "Roxo", 456);
		ClasseAviao aviao1 = new ClasseAviao("Airbus", "Azul", 578);

		System.out.println("Informações sobre o avião:");
		System.out.println("");
		aviao.levantarVoo();
		aviao.voar();
		aviao.pousar();

		System.out.println();
		aviao.estado();
		System.out.println();
		aviao1.estado();
	}

}
