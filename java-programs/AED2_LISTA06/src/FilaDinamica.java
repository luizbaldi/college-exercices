
public class FilaDinamica {
	private Item item;
	private FilaDinamica prox;

	FilaDinamica() {
		this.setProx(null);
	}

	public boolean ehFilaVazia() {
		boolean vazia = false;
		if (this.prox == null)
			vazia = true;
		return vazia;
	}

	public void enfileira(int elemento) {
		if (ehFilaVazia()) {
			this.setProx(new FilaDinamica());
			this.getProx().item = new Item();
			this.getProx().item.setChave(elemento);
		} else {
			FilaDinamica aux = ultimo(this.getProx());
			aux.setProx(new FilaDinamica());
			aux.getProx().item = new Item();
			aux.getProx().item.setChave(elemento);
		}
	}

	public void desenfileira() {
		if(!ehFilaVazia()){
			FilaDinamica aux = this.getProx().getProx();
			this.setProx(aux);
		}
	}
	
	public FilaDinamica primeiro() {
		FilaDinamica refPrimeiro = null;
		if (!ehFilaVazia())
			refPrimeiro = this.getProx();
		return refPrimeiro;
	}

	public FilaDinamica ultimo(FilaDinamica prox) {
		if (prox.getProx() == null)
			return prox;
		else
			return ultimo(prox.getProx());
	}

	public void fazFilaVazia() {
		this.setProx(null);
	}
	
	public void escreve(FilaDinamica prox) {
		if (prox.getProx() != null) {
			System.out.println("Chave: " + prox.item.getChave());
			escreve(prox.getProx());
		} else
			System.out.println("Chave: " + prox.item.getChave());
	}

	public FilaDinamica getProx() {
		return prox;
	}

	public void setProx(FilaDinamica prox) {
		this.prox = prox;
	}
}
