
public class Lista {
	int lista[];
	int n;

	Lista() {
		this(6);
	}
	
	Lista(int tamanho) {
		this.lista = new int[tamanho];
		this.n = 0;
	}
	
	public void inserirFim(int elemento) throws ListaException {
		if (n == lista.length) {
			throw new ListaException("Lista cheia. Lista cheia no elemento " + elemento);
		}
		
		this.lista[n] = elemento;
		n++;
	}
	
	public void inserirInicio(int elemento) throws ListaException {
		if (n == lista.length) {
			throw new ListaException("Lista cheia. Lista cheia no elemento " + elemento);
		}
		
		for (int i = n; i > 0; i--) {
			lista[i] = lista[i - 1];
		}
		
		lista[0] = elemento;
		n++;
	}
	
	public void inserirPos(int elemento, int pos) throws ListaException {
		if ((pos < 0 || pos > lista.length) && n == lista.length) {
			throw new ListaException("Posição inválida ou lista cheia");
		}
		
		for (int i = n; i > pos; i--) {
			lista[i] = lista[i - 1];
		}
		
		lista[pos] = elemento;
		n++;
	}
	
	public int removerFim() throws ListaException {
		if (n == 0) {
			throw new ListaException("Lista vazia!");
		}
		
		n--;
		return lista[n];
	}
	
	public int removerInicio() throws ListaException {
		if (n == 0) {
			throw new ListaException("Lista Vazia!");
		}
		
		int resp = lista[0];
		n--;
		for (int i = 0; i < n; i++) {
			lista[i] = lista[i + 1];
		}
		return resp;
	}
	
	public void removerPos(int pos) throws ListaException {
		if ((pos < 0 || pos > lista.length) && n == lista.length) {
			throw new ListaException("Posição inválida ou lista cheia");
		}
		
		for (int i = n; i > pos; i--) {
			lista[i] = lista[i + 1];
		}
		
		n--;
	}
}
