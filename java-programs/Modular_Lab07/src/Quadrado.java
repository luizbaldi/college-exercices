import java.awt.*;

public class Quadrado extends Figura {

	public Quadrado(int px, int py, int lado) throws ExcecaoPosicaoInvalida {
		super(px, py, lado);
	}
	
	public void desenha(Graphics g) {
		Color velhaCor = g.getColor();
		g.setColor(cor);
		g.drawRect(x, y, lado, lado);
		g.setColor(velhaCor);
	}
}
