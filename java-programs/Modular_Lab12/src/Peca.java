
public class Peca {
	private EstadoPeca estado;
	private TipoPeca tipo;
	private int garantiaMeses;
	
	public Peca(EstadoPeca estado, TipoPeca tipo) {
		this.estado = estado;
		this.tipo = tipo;
		this.garantiaMeses = 6;
	}

	public EstadoPeca getEstado() {
		return estado;
	}

	public void setEstado(EstadoPeca estado) {
		this.estado = estado;
	}

	public TipoPeca getTipo() {
		return tipo;
	}

	public void setTipo(TipoPeca tipo) {
		this.tipo = tipo;
	}
	
	public int getGarantia() {
		return this.garantiaMeses;
	}
	
	public float getPreco() {
		float preco;
		switch(tipo) {
			case VELA_IGNICAO:
				if (estado == EstadoPeca.USADA) {
					preco = 25.5f;
				} else {
					preco = 39.9f;
				}
				break;
			case FILTRO_OLEO: 
				if (estado == EstadoPeca.USADA) {
					preco = 12f;
				} else {
					preco = 18.9f;
				}
				break;
			case FILTRO_COMBUSTIVEL:
				if (estado == EstadoPeca.USADA) {
					preco = 79.9f;
				} else {
					preco = 99.99f;
				}
				break;
			case PASTILHA_FREIO:
				if (estado == EstadoPeca.USADA) {
					preco = 45f;
				} else {
					preco = 59.9f;
				}
				break;
			default:
				System.out.println("Tipo nao encontrado.");
				preco = -1f;
				break;
		}
		
		return preco;
	}
	
	public String getDadosCupom() {
		String dadosCupom = "\n";
		
		dadosCupom += "- Tipo: " + this.getTipo() + "\n";
		dadosCupom += "- Preço: " + this.getPreco() + "\n";
		dadosCupom += "Obs: Estado " + this.getEstado() + ", garantia " + this.getGarantia() + " meses\n";
		
		return dadosCupom;
	}
}
