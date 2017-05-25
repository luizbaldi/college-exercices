import java.awt.Graphics;

public class Polimorfismo {
	ListaDeFiguras lf;
	
	public void init() {
		
		try {
			lf = new ListaDeFiguras(10);
			lf.insere(new Quadrado(0, 0, 30));
			lf.insere(new Quadrado(100, 100, 80));
			lf.insere(new Circulo(20, 40, 34));
		} catch (ExcecaoPosicaoInvalida e) {
			System.out.println("Deu ruim. Erro: " + e.getMessage());
		} catch (ExcecaoListaCheia e) {
			System.out.println("Deu ruim. Erro: " + e.getMessage());
		}
	}
	
	public void paint(Graphics g) {
		lf.desenha(g);
	}
}
