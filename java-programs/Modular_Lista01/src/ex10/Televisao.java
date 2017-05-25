package ex10;

public class Televisao {
	private boolean estaLigada;
	private int volume;
	private int canal;
	
	public Televisao() {
		this.estaLigada = false;
		this.volume = 0;
		this.canal = 1;
	}	
	
	public boolean isEstaLigada() {
		return estaLigada;
	}

	public void setEstaLigada(boolean estaLigada) {
		this.estaLigada = estaLigada;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public void liga() {
		this.estaLigada = true;
	}
	
	public void desliga() {
		this.estaLigada = false;
	}
	
	public void aumentaVolume() {
		if (this.volume < 100) {
			++this.volume;
		}
	}
	
	public void diminuiVolume() {
		if (this.volume > 0) {
			--this.volume;
		}
	}
	
	public void sobeCanal() {
		if (this.canal < 83) {
			++this.canal;
		}
	}
	
	public void desceCanal() {
		if (this.canal > 1) {
			--this.canal;
		}
	}
	
	public String toString() {
		String str = "Esta ligada: " + (this.estaLigada ? "Sim" : "Não") + "\n"
				+ "Volume atual: " + this.getVolume() + "\n"
				+ "Canal atual: " + this.getCanal() + "\n";
		
		return str;
	}
	
}
