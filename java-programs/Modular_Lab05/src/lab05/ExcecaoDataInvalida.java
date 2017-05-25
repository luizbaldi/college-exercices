package lab05;


public class ExcecaoDataInvalida extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4910273284324438856L;
	public String nomeAtr;
	public int valor;

	ExcecaoDataInvalida(String Nome, int val) {
		super("O atributo " + Nome + 
				" não pode receber " + val);
		nomeAtr = Nome;
		valor = val;
	}

}
