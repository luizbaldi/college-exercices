
public class Item {
	
	private int chave, x;
	
	Item() {
		this.setChave(0);
		this.setX(0);
	}
	
	Item(int chave, int x) {
		this.setChave(chave);
		this.setX(x);
	}

	public int getChave() {
		return chave;
	}

	public void setChave(int chave) {
		this.chave = chave;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	

}
