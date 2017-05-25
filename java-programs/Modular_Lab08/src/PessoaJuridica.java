
public class PessoaJuridica extends Cliente {
	private double cnpj;
	
	PessoaJuridica(String nome, int tel, String endereco, int cnpj) {
		super(nome, tel, endereco);
		this.setCpf(cnpj);
	}
	
	public void setCpf(int cpf) {
		this.cnpj = cpf;
	}
	
	public double getCpf() {
		return this.cnpj;
	}
}
