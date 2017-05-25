import java.awt.*;

public abstract class Figura {
	protected int x, y, lado;
	protected Color cor;
	
	public Figura(int px, int py, int l) throws ExcecaoPosicaoInvalida {
		if (px < 0 || py < 0) {
			throw new ExcecaoPosicaoInvalida();
		}
		
		x = px;
		y = py;
		lado = l;
		cor = Color.BLACK;
	}
	
	public void setCor(Color c) {
		cor = c;
	}
	
	public abstract void desenha(Graphics g);
}
