public class BSTree {
	
	private int chave;
	private BSTree esq;
	private BSTree dir;
	
	BSTree(int chave, BSTree esq, BSTree dir) {
		setChave(chave);
		setEsq(esq);
		setDir(dir);
	}
	
	BSTree() {
		this(-1, null, null);
	}
	
	public int getChave() {
		return chave;
	}
	
	public BSTree getEsq() {
		return esq;
	}
	
	public BSTree getDir() {
		return dir;
	}
	
	public void setChave(int chave) {
		this.chave = chave;
	}
	
	public void setEsq(BSTree esq) {
		this.esq = esq;
	}
	
	public void setDir(BSTree dir) {
		this.dir = dir;
	}
	
	public boolean estahVazia() {
		return getChave() == -1 && getEsq() == null && getDir() == null;
	}
	
	public void anexa(int chave) {
		setChave(chave);
		setEsq(new BSTree());
		setDir(new BSTree());
	}
	
	public boolean insere(int chave) {
		boolean sucesso = true;
		if (this.estahVazia()) {
			anexa(chave);
		} else {
			if (chave < this.getChave()) {
				esq.insere(chave);
			} else if (chave > this.getChave()) {
				dir.insere(chave);
			} else {
				sucesso = false;
			}
		}
		
		return sucesso;
	}
	
	public void preOrdem() {
		if (estahVazia()) {
			return;
		}
		System.out.println(this.getChave() + ", ");
		esq.preOrdem();
		dir.preOrdem();
	}
	
	public void emOrdem() {
		if (estahVazia()) {
			return;
		}
		
		esq.emOrdem();
		System.out.println(this.getChave() + ", ");
		dir.emOrdem();
	}
	
	public void posOrdem() {
		if (estahVazia()) {
			return;
		}
		
		esq.posOrdem();
		dir.posOrdem();
		System.out.println(this.getChave() + ", ");
	}
	
	private BSTree buscaBin(BSTree r, int valor) {  
		if(r == null)  
			return null;  
		if(valor == r.getChave())  
			return r;  
		if(valor < r.getChave())      
			return(buscaBin(r.getEsq(),valor));  
		else    
			return(buscaBin(r.getDir(),valor));  
   }
	
	public int getAlturaNodo(int chave) {
		BSTree aux = this;
		int nivel = 0;
		while (aux != null && aux.getChave() != chave) {
			if (chave < aux.getChave()) {
				aux = aux.getEsq();
			} else {
				aux = aux.getDir();
			}
			nivel++;
		}
		
		return nivel;
	}
	
	public int getFatorBalanceamento(int chave) {
		BSTree arvore = this.buscaBin(this, chave);
		int alturaEsq = getAlturaNodo(arvore.getEsq().getChave());
		int alturaDir = getAlturaNodo(arvore.getDir().getChave());
		
		return alturaEsq - alturaDir;
	}

	// Está faltando os algoritmos de rotação pois tive dúvidas.
}
