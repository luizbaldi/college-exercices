public class Cliente {
	private int code;
	private String primeiroNome;
	private String ultimoNome;
	
	public Cliente() {
		this.code = 0;
		this.primeiroNome = "Nome";
		this.ultimoNome = "Fantasia";
	}
	
	public Cliente(int code, String primeiroNome, String ultimoNome) {
		this.code = code;
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}
	
	@Override
	public String toString() {
		return "Código: " + this.code + "\nPrimeiro nome: " + this.primeiroNome + "\nUltimo nome: " + this.ultimoNome + "\n";
	}
}
