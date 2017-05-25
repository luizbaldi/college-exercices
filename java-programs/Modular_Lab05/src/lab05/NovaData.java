package lab05;


public class NovaData extends Data {
	static final String NomeMeses[] = { "Janeiro", "Fevereiro", "Março",
			"Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro",
			"Novembro", "Dezembro" };

	public String toString() {
		String temp = getDia() + " de " + 
		NomeMeses[getMes() - 1] + " de " + getAno();
		return temp;
	}

}
