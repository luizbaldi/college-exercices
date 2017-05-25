import java.awt.*;

public class Circulo extends Figura {
	
	public Circulo(int px, int py, int lado) throws ExcecaoPosicaoInvalida {
		super(px, py, lado);
	}
	
	public void desenha(Graphics g) {
		Color velhaCor = g.getColor();
		g.setColor(cor);
		g.drawOval(x, y, lado, lado);
		g.setColor(velhaCor);
	}
}
