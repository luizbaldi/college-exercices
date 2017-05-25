
public class ListaLinear {
	private int tam;
	private int item[];
	private int ultimo;
	
	public ListaLinear(int tam) {
		this.item = new int[tam];
		this.ultimo = 0;
	}
	
	public boolean listaVazia() {
		if (ultimo == tam) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean listaCheia() {
		if (ultimo != (tam - 1)) {
			return false;
		} else {
			return true;
		}
	}
	
	// @toDo: Refactor this 'sucesso' variable
	public boolean insere(int item, int posicao) {
		boolean sucesso = false;
		if (posicao <= (ultimo + 1)) {
			int i = ++ultimo;
			while (posicao < i) {
				this.item[i] = this.item[i - 1];
				i--;
			}
			this.item[i] = item;
			sucesso = true;
		}
		return sucesso;
	}
	
	public boolean remove(int posicao) {
		if (posicao <= ultimo) {
			int i = posicao;
			while(i < ultimo) {
				item[i] = item[i + 1];
				i++;
			}
			ultimo--;
			return true;
		} else {
			System.out.println("Posição inválida");
			return false;
		}
	}
	
	public int pesquisa(Integer posicao) {
		return item[posicao];
	}
	
	public int pesquisa(int item) {
		for (int i = 0; i < this.item.length; i++) {
			if (this.item[i] == item) {
				return i;
			}
		}
		return -1;
	}
	
	public void fazListaVazia() {
		ultimo = -1;
	}
	
	public void escreve() {
		System.out.println("\n");
		for (int i = 0; i < item.length; i++) {
			System.out.println("Item[" + i + "]: " + item[i]);
		}
	}
}
