
public class ListaLinear {

	Item[] item;
	private static final int MAXTAM = 100;
	int ultimo = -1;

	ListaLinear() {
		item = new Item[MAXTAM];
	}

	ListaLinear(int tamLista) {
		item = new Item[tamLista];
	}

	public boolean listaCheia() {
		boolean cheia = false;
		if (this.ultimo == (MAXTAM - 1)) {
			cheia = true;
		}
		return cheia;
	}

	public boolean insere(Item item, int pos) {		
		if (pos < 0 || pos >= ultimo) {
			return false;
		}
		ultimo++;
		
		int i;
		for (i = ultimo; i > pos; i--) {
			this.item[i] = this.item[i - 1];
		}
		this.item[i] = item;
		return true;
	}

	public int pesquisa(Item item) {
		for (int i = 0; i <= this.ultimo; i++) {
			if (item.getChave() == this.item[i].getChave())
				return i;
		}
		return -1;
	}

	public Item pesquisa(int posicao) {
		if (posicao < 0 || posicao > ultimo) {
			return null;
		}
		return item[posicao];
	}

}
