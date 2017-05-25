import java.time.LocalDateTime;

public class ContaCorrente extends ServicoBancario {
	private boolean temTalaoCheque;
	private LocalDateTime dataEmissaoTalao;
	
	ContaCorrente(Cliente cliente, boolean temTalaoCheque) {
		super(cliente);
		
		this.temTalaoCheque = temTalaoCheque;
		
		if (temTalaoCheque) {
			this.dataEmissaoTalao = LocalDateTime.now();
		}
	}
	
	public void emiteTalaoCheque() {
		extratos.add(new Extrato(TipoOperacao.EMISSAO_TALAO, 0));
		
		if (!LocalDateTime.now().isAfter(dataEmissaoTalao.plusDays(30))) {
			// Inferior a 30 dias
			extratos.add(new Extrato(TipoOperacao.SAQUE, 7.9f));
			try {
				this.efetuaSaque(7.9f);
			} catch (ExcecaoQuantiaNegativa e) {
				System.out.println(e.getMessage());
			} catch (ExcecaoSaldoInsuficiente e) {
				System.out.println(e.getMessage());
			}
		}
		
		temTalaoCheque = true;
	}
	
	public boolean temTalaoCheque() {
		return this.temTalaoCheque;
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
