import java.util.ArrayList;

public class NotaFiscal {
	
	public static String emitirNota(ArrayList<Automovel> automoveis, ArrayList<Peca> pecas) {
		String textoNota = "";
		
		textoNota += "\t\t     CUPOM FISCAL";
		textoNota += "\n\t\tLoja Automovel Supimpa";
		
		textoNota += "\n\n\t-- Automóveis Vendidos --";
		for (Automovel automovel : automoveis) {
			textoNota += automovel.getDadosCupom();
		}
		
		textoNota += "\n\t-- Peças vendidas --";
		for (Peca peca : pecas) {
			textoNota += peca.getDadosCupom();
		}
		
		return textoNota;
	}
}
