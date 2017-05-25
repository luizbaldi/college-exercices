
public class PilhaDinamica {
	private Item item;
	private PilhaDinamica prox;

	PilhaDinamica() {
		this.setProx(null);
	}

	public void empilha(int elemento) {
		if (ehPilhaVazia()) {
			this.setProx(new PilhaDinamica());
			this.getProx().item = new Item();
			this.getProx().item.setChave(elemento);
		} else {
			PilhaDinamica aux = this.topo(this.getProx());
			aux.setProx(new PilhaDinamica());
			aux.getProx().item = new Item();
			aux.getProx().item.setChave(elemento);
		}
	}

	public void desempilha(PilhaDinamica prox) {
		if(!ehPilhaVazia()) {
			if(prox.getProx().getProx() == null) {
				prox.setProx(null);
			} else
				desempilha(prox.getProx());
		}
	}
	
	public boolean ehPilhaVazia() {
		boolean vazia = false;
		if (this.getProx() == null)
			vazia = true;
		return vazia;
	}

	public PilhaDinamica topo(PilhaDinamica prox) {
		if (prox.getProx() == null)
			return prox;
		else
			return topo(prox.getProx());
	}

	public void escreve(PilhaDinamica prox) {
		if (prox.getProx() != null) {
			System.out.println("Elemento: " + prox.item.getChave());
			escreve(prox.getProx());
		} else 
			System.out.println("Elemento: " + prox.item.getChave());
	}
	
	public PilhaDinamica getProx() {
		return prox;
	}

	public void setProx(PilhaDinamica prox) {
		this.prox = prox;
	}

}
