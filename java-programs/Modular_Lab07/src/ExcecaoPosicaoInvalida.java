public class ExcecaoPosicaoInvalida extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3706924186709042230L;

	ExcecaoPosicaoInvalida() {
		super("N�o � poss�vel criar figuras com coordenadas negativas");
	}
}
