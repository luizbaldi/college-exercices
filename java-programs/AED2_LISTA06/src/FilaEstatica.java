
public class FilaEstatica {
	private int TAM = 5;
	private Item[] item = new Item[TAM];
	private int primeiro, ultimo;

	FilaEstatica() {
		setPrimeiro(-1);
		setUltimo(-1);
	}

	public boolean enfileira(int elemento) {
		if (filaCheia()) {
			return false;
		} else if (filaVazia()) {
			this.item[0] = new Item();
			this.item[0].setChave(elemento);
		} else {
			this.item[getUltimo() + 1] = new Item();
			this.item[this.getUltimo() + 1].setChave(elemento);
		}
		setUltimo(getUltimo() + 1);
		setPrimeiro(0);
		return true;
	}

	public boolean desenfileira() {
		if (this.filaVazia())
			return false;
		this.item[this.getUltimo()].setChave(0);
		this.setUltimo(getUltimo() - 1);
		return true;
	}

	public boolean filaVazia() {
		boolean vazia = false;
		if (this.getPrimeiro() == -1)
			vazia = true;
		return vazia;
	}

	public boolean filaCheia() {
		boolean cheia = false;
		if (this.getUltimo() == this.getTAM())
			cheia = true;
		return cheia;
	}

	public Item primeiro() {
		Item refPrimeiro = null;
		if (!filaVazia())
			refPrimeiro = this.item[0];
		return refPrimeiro;
	}

	public Item ultimo() {
		Item refUltimo = null;
		if (!filaVazia())
			refUltimo = this.item[this.getUltimo()];
		return refUltimo;
	}

	public void escreve() {
		if(!filaVazia()) {
			for (int i = 0; i <= this.getUltimo(); i++) {
				System.out.println(this.item[i].getChave());
			}
		}
	}
	
	public void fazFilaVazia() {
		if (!filaVazia()) {
			for (int i = 0; i < this.getTAM(); i++) {
				this.item[i].setChave(0);
			}
		}
	}

	public int getTAM() {
		return TAM;
	}

	public void setTAM(int tAM) {
		TAM = tAM;
	}

	public int getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(int cabeca) {
		this.primeiro = cabeca;
	}

	public int getUltimo() {
		return ultimo;
	}

	public void setUltimo(int cauda) {
		this.ultimo = cauda;
	}

	public Item[] getItem() {
		return item;
	}
}
