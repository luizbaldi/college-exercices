
public class PessoaFisica extends Cliente {
	private double cpf;
	
	PessoaFisica(String nome, int tel, String endereco, int cpf) {
		super(nome, tel, endereco);
		this.setCpf(cpf);
	}
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public double getCpf() {
		return this.cpf;
	}
}
