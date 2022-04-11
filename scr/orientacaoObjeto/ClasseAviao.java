package orientacaoObjeto;

public class ClasseAviao {
	// ATRIBUTOS -> CARACTERÍSTICAS
	String marca;
	String cor;
	Double qtdPassageiros;
	boolean voando;
	boolean gasolina;
	boolean pousar;

	// METODO CONSTRUTOR
	public ClasseAviao(String m, String c, double p) {
		this.marca = m;
		this.cor = c;
		this.qtdPassageiros = p;
		this.voando = false;
		this.gasolina = false;
		this.pousar = true;
	}

	// METÓDOS -> COMPORTAMENTOS
	public void levantarVoo() {
		if (gasolina == true) {
			System.out.println("O avião está abastecido. Levantando voo...");
			voando = true;
			voar();
		} else
			System.out.println("O avião não está abastecido e não pode levantar voo.");
	}

	public void voar() {
		if (voando == true)
			System.out.println("O avião está voando.");
		else
			System.out.println("O avião não está voando.");
	}

	public void pousar() {
		if (pousar == true)
			System.out.println("O avião aterrissou.");

		else
			System.out.println("O avião está voando.");
	}

	public void estado() {
		System.out.println("Marca do avião: " + this.marca);
		System.out.println("Cor do avião: " + this.cor);
		System.out.println("Quantidade de passageiros: " + this.qtdPassageiros);
		System.out.println("O avião está voando? " + this.voando);
		System.out.println("O avião está abastecido? " + this.gasolina);
		System.out.println("O avião está pousou? " + this.pousar);
	}
}