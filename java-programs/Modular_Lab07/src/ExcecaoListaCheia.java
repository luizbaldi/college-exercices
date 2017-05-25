
public class ExcecaoListaCheia extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4603982297660513914L;
	private int tam;
	
	ExcecaoListaCheia(int tam) {
		super("O valor " + tam + " excede o tamanho máximo da lista");
		this.tam = tam;
	}
	
	public int getTam() {
		return tam;
	}
}
