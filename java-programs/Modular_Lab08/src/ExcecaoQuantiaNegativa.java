
public class ExcecaoQuantiaNegativa extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1626355423365215112L;
	
	public ExcecaoQuantiaNegativa() {
		super("N�o � poss�vel realizar a transa��o com uma quantia negativa");
	}
}
