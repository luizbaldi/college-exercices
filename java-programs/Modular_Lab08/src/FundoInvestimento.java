
public class FundoInvestimento extends ServicoBancario {
	private float taxaAdministracao;
	private int qtdCotas;
	
	FundoInvestimento(Cliente cliente, float taxaAdministracao, int qtdCotas) {
		super(cliente);
		this.taxaAdministracao = taxaAdministracao;
		this.qtdCotas = qtdCotas;
	}

	public float getTaxaAdministracao() {
		return taxaAdministracao;
	}

	public void setTaxaAdministracao(float taxaAdministracao) {
		this.taxaAdministracao = taxaAdministracao;
	}

	public int getQtdCotas() {
		return qtdCotas;
	}

	public void adicionaCotas(int qtdCotas) {
		extratos.add(new Extrato(TipoOperacao.ADICIONA_COTA, 0));
		this.qtdCotas += qtdCotas;
	}
	
	public void removeCotas(int qtdCotas) {
		if (this.qtdCotas - qtdCotas > 0) {
			extratos.add(new Extrato(TipoOperacao.REMOVE_COTA, 0));
			this.qtdCotas -= qtdCotas;
		}
	}
	
	@Override
	public float getSaldo() {
		// Simulando valor das cotas no dia
		float valorCotasDia = 1.2f;
		
		return this.qtdCotas * valorCotasDia;
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
