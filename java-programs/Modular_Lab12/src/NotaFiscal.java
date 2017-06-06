import java.util.ArrayList;

public class NotaFiscal {
	
	public static String emitirNota(ArrayList<Automovel> automoveis, ArrayList<Peca> pecas) {
		String textoNota = "";
		
		textoNota += "\t\t\tCUPOM FISCAL";
		textoNota += "\n\t\tLoja Automovel Supimpa";
		
		textoNota += "\n\n\tAutomóveis Vendidos";
		if (automoveis.size() == 0) {
			textoNota += "\nNenhum automóvel vendido até o momento\n";
		} else {
			for (Automovel automovel : automoveis) {
				textoNota += automovel.getDadosCupom();
			}
		}
		
		
		textoNota += "\n\tPeças vendidas";
		if (pecas.size() == 0) {
			textoNota += "\nNenhuma peça vendida até o momento\n";
		} else {
			for (Peca peca : pecas) {
				textoNota += peca.getDadosCupom();
			}
		}
		
		
		return textoNota;
	}
}
