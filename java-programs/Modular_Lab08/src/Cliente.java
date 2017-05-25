import java.util.ArrayList;

public abstract class Cliente {
	private String nome;
	private int tel;
	private String endereco;
	private ArrayList<ServicoBancario> servicos;
	
	public Cliente(String nome, int tel, String endereco) {
		this.setNome(nome);
		this.setTel(tel);
		this.setEndereco(endereco);
		this.servicos = new ArrayList<ServicoBancario>();
	}
	
	public Cliente() {
		this("Nome fantasia", 0, "Cliente sem endereço");
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getTel() {
		return tel;
	}
	
	public void setTel(int tel) {
		this.tel = tel;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void adicionaServico(ServicoBancario servico) {
		servicos.add(servico);
	}
	
	public ArrayList<ServicoBancario> getServicos() {
		return this.servicos;
	}
}
