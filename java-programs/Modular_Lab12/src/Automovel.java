
public class Automovel {
	private CorAutomovel cor;
	private ModeloAutomovel modelo;
	private int ano;
	
	public Automovel(CorAutomovel cor, ModeloAutomovel modelo, int ano) {
		this.cor = cor;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	public CorAutomovel getCor() {
		return cor;
	}
	
	public void setCor(CorAutomovel cor) {
		this.cor = cor;
	}
	
	public ModeloAutomovel getModelo() {
		return modelo;
	}
	
	public void setModelo(ModeloAutomovel modelo) {
		this.modelo = modelo;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public float getPreco() {
		float preco;
		
		switch(modelo) {
			case BMW_M140i:
				preco = 25.5f;
				break;
			case FERRARI_458: 
				preco = 18.9f;
				break;
			case PALIO_YOUNG:
				preco = 99.99f;
				break;
			case VELOSTER:
				preco = 59.9f;
				break;
			default:
				System.out.println("Modelo nao encontrado.");
				preco = -1f;
				break;
		}
		
		return preco;
	}
	
	public String getDadosCupom() {
		String dadosCupom = "\n";
		
		dadosCupom += "- Modelo: " + this.getModelo() + "\n";
		dadosCupom += "- Preço: " + this.getPreco() + "\n";
		dadosCupom += "Obs: Cor " + this.getCor() + ", ano " + this.getAno() + "\n";
		
		return dadosCupom;
	}
	
}
