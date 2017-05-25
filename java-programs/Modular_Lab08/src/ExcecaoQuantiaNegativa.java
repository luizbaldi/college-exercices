
public class ExcecaoQuantiaNegativa extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1626355423365215112L;
	
	public ExcecaoQuantiaNegativa() {
		super("Não é possível realizar a transação com uma quantia negativa");
	}
}
