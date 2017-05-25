import java.util.Date;

public class Extrato {
	private Date dataOperacao;
	private TipoOperacao tipoOperacao;
	private float valorOperacao;
	
	Extrato(TipoOperacao tipoOperacao, float valorOperacao) {
		this.dataOperacao = new Date();
		this.tipoOperacao = tipoOperacao;
		this.valorOperacao = valorOperacao;
	}
	
	public Date getDataOperacao() {
		return this.dataOperacao;
	}
	
	public TipoOperacao getTipoOperacao() {
		return tipoOperacao;
	}
	
	public float getValorOperacao() {
		return this.valorOperacao;
	}
}
