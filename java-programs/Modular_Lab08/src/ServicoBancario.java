import java.util.ArrayList;

public abstract class ServicoBancario {
	protected static int id;
	protected float saldo;
	protected ArrayList<Extrato> extratos;
	protected Cliente cliente;
	
	ServicoBancario(Cliente cliente) {
		id++;
		this.saldo = 0;
		extratos = new ArrayList<Extrato>();
		this.cliente = cliente;
	}
	
	public int getId() {
		return id;
	}
	
	public float getSaldo() {
		return this.saldo;
	}
	
	public void efetuaDeposito(float valor) throws ExcecaoQuantiaNegativa {
		if (valor > 0) {
			extratos.add(new Extrato(TipoOperacao.DEPOSITO, valor));
			
			this.saldo += valor;	
		} else {
			throw new ExcecaoQuantiaNegativa();
		}
	}
	
	public void efetuaSaque(float valor) throws ExcecaoQuantiaNegativa, ExcecaoSaldoInsuficiente {
		if (valor > 0) {
			extratos.add(new Extrato(TipoOperacao.SAQUE, valor));
			
			if (this.saldo - valor > 0) {
				this.saldo -= valor;
			} else {
				throw new ExcecaoSaldoInsuficiente();
			}
		} else {
			throw new ExcecaoQuantiaNegativa();
		}
		
	}
	
	public void imprimirExtrato() {
		System.out.println("\n-- Imprimindo extrato --");
		for (Extrato extrato : extratos) {
			System.out.println("Data da operação: " + extrato.getDataOperacao().toString());
			System.out.println("Tipo da operação: " + extrato.getTipoOperacao().toString());
			System.out.println("Valor da operação: " + extrato.getValorOperacao());
		}
	}
	
	public void consultaSaldo() {
		extratos.add(new Extrato(TipoOperacao.CONSULTA_SALDO, 0));
		
		System.out.println("Saldo atual: " + this.getSaldo());
	}
	
	public abstract float investimentoTotal();
}
