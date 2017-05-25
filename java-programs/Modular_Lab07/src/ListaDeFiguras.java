import java.awt.*;

public class ListaDeFiguras {
	private Figura vet[];
	private int tmax;
	private int c;
	
	public ListaDeFiguras(int t) {
		tmax = t;
		c = 0;
		vet = new Figura[t];
	}
	
	public void insere(Figura f) throws ExcecaoListaCheia {
		if (c == tmax) 
			throw new ExcecaoListaCheia(c);
		
		vet[c] = f;
		c++;
	}
	
	public void desenha(Graphics g) {
		for (int i = 0; i < c; i++) {
			vet[i].desenha(g);
		}
	}
}
