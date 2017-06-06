import java.util.ArrayList;

public class NotaFiscal {
	
	public static String emitirNota(ArrayList<Automovel> automoveis, ArrayList<Peca> pecas) {
		String textoNota = "";
		
		textoNota += "\t\t\tCUPOM FISCAL";
		textoNota += "\n\t\tLoja Automovel Supimpa";
		
		textoNota += "\n\n\tAutom�veis Vendidos";
		if (automoveis.size() == 0) {
			textoNota += "\nNenhum autom�vel vendido at� o momento\n";
		} else {
			for (Automovel automovel : automoveis) {
				textoNota += automovel.getDadosCupom();
			}
		}
		
		
		textoNota += "\n\tPe�as vendidas";
		if (pecas.size() == 0) {
			textoNota += "\nNenhuma pe�a vendida at� o momento\n";
		} else {
			for (Peca peca : pecas) {
				textoNota += peca.getDadosCupom();
			}
		}
		
		
		return textoNota;
	}
}
