
public class ExcecaoSaldoInsuficiente extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3380882361797919810L;

	ExcecaoSaldoInsuficiente() {
		super("O saque n�o pode ser realizado pois seu saldo � insuficiente.");
	}
	
}
