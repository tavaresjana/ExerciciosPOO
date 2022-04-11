package orientacaoObjeto;

public class ClasseAviao {
	// ATRIBUTOS -> CARACTER�STICAS
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

	// MET�DOS -> COMPORTAMENTOS
	public void levantarVoo() {
		if (gasolina == true) {
			System.out.println("O avi�o est� abastecido. Levantando voo...");
			voando = true;
			voar();
		} else
			System.out.println("O avi�o n�o est� abastecido e n�o pode levantar voo.");
	}

	public void voar() {
		if (voando == true)
			System.out.println("O avi�o est� voando.");
		else
			System.out.println("O avi�o n�o est� voando.");
	}

	public void pousar() {
		if (pousar == true)
			System.out.println("O avi�o aterrissou.");

		else
			System.out.println("O avi�o est� voando.");
	}

	public void estado() {
		System.out.println("Marca do avi�o: " + this.marca);
		System.out.println("Cor do avi�o: " + this.cor);
		System.out.println("Quantidade de passageiros: " + this.qtdPassageiros);
		System.out.println("O avi�o est� voando? " + this.voando);
		System.out.println("O avi�o est� abastecido? " + this.gasolina);
		System.out.println("O avi�o est� pousou? " + this.pousar);
	}
}