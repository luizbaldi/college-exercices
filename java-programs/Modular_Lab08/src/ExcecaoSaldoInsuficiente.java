
public class ExcecaoSaldoInsuficiente extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3380882361797919810L;

	ExcecaoSaldoInsuficiente() {
		super("O saque não pode ser realizado pois seu saldo é insuficiente.");
	}
	
}
