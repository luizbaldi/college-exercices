import java.util.ArrayList;

public class Concessionaria {
	private ArrayList<Automovel> automoveis;
	private ArrayList<Peca> pecas;
	
	public Concessionaria() {
		this.automoveis = new ArrayList<Automovel>();
		this.pecas= new ArrayList<Peca>();
	}
	
	public void adicionaAutomovel(Automovel automovel) {
		automoveis.add(automovel);
	}
	
	public void adicionaPeca(Peca peca) {
		pecas.add(peca);
	}
	
	public String getNotaFiscal() {
		return NotaFiscal.emitirNota(automoveis, pecas);
	}
}
