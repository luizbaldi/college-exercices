
public class Poupanca extends ServicoBancario {
	private float rendimentoMensal;
	
	Poupanca(Cliente cliente, float rendimentoMensal) {
		super(cliente);
		this.rendimentoMensal = rendimentoMensal;
	}

	public float getRendimentoMensal() {
		return rendimentoMensal;
	}

	public void setRendimentoMensal(float rendimentoMensal) {
		this.rendimentoMensal = rendimentoMensal;
	}
	
	@Override
	public float investimentoTotal() {
		float investimentoTotal = 0;
		for (Extrato extrato : extratos) {
			if (extrato.getTipoOperacao() == TipoOperacao.DEPOSITO) {
				investimentoTotal += extrato.getValorOperacao();
			}
		}
		return investimentoTotal;
	}
}
