import java.util.ArrayList;

public class NotaFiscal {
	
	public static String emitirNota(ArrayList<Automovel> automoveis, ArrayList<Peca> pecas) {
		String textoNota = "";
		
		textoNota += "\t\t     CUPOM FISCAL";
		textoNota += "\n\t\tLoja Automovel Supimpa";
		
		textoNota += "\n\n\t-- Autom�veis Vendidos --";
		for (Automovel automovel : automoveis) {
			textoNota += automovel.getDadosCupom();
		}
		
		textoNota += "\n\t-- Pe�as vendidas --";
		for (Peca peca : pecas) {
			textoNota += peca.getDadosCupom();
		}
		
		return textoNota;
	}
}
