package collection;

public class ExercicioCollection {

		private String frutas;
		private int qtd;
		
		//metodo construtor
		public ExercicioCollection(String x, int n) {
			this.frutas=x;
			this.qtd=n;
		}
			
			public String getFrutas() {
			return frutas;
		}

		public void setFrutas(String frutas) {
			this.frutas = frutas;
		}

		public int getQtd() {
			return qtd;
		}

		public void setQtd(int qtd) {
			this.qtd = qtd;
		}

			public String toString() //criou um metodo pra imprimir 
			{
				return "frutas:" + this.frutas+", qtd. "+ this.qtd;
			}
		}
