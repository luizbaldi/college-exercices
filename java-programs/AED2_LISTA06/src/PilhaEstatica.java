
public class PilhaEstatica {
	private int topo = -1, TAM = 5;
	private Item[] item = new Item[TAM];

	PilhaEstatica() {}
	
	public boolean empilha(Item item) {
		boolean empilhado = true;
		if (this.pilhaCheia())
			empilhado = false;
		setTopo(getTopo() + 1);
		this.item[getTopo()] = new Item();
		this.item[getTopo()] = item;
		return empilhado;
	}

	public boolean desempilha() {
		boolean desempilhado = true;
		if (this.pilhaVazia())
			desempilhado = false;
		this.item[getTopo()].setChave(0);
		this.setTopo(getTopo() - 1);
		return desempilhado;
	}

	public boolean pilhaVazia() {
		boolean vazia = false;
		if (this.getTopo() == -1)
			vazia = true;
		return vazia;
	}

	public boolean pilhaCheia() {
		boolean cheia = false;
		if (this.getTopo() == this.getTAM() - 1) {
			cheia = true;
		}
		return cheia;
	}

	public Item topo() {
		Item refTopo = null;
		if(!pilhaVazia())
			refTopo = this.item[getTopo()];
		return refTopo;
	}

	public void fazPilhaVazia() {
		if(!pilhaVazia()) {
			for (int i = 0; i < TAM; i++) {
				this.item[i].setChave(0);
			}
		}
	}
	
	public void escreve() {
		if (!pilhaVazia()) {
			for(int i = 0; i <= this.getTopo(); i++)
				System.out.println(this.item[i].getChave());
		}
	}
	
	public int getTopo() {
		return topo;
	}

	public void setTopo(int topo) {
		this.topo = topo;
	}

	public int getTAM() {
		return TAM;
	}

	public Item[] getItem() {
		return item;
	}
}
