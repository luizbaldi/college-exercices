import java.util.ArrayList;
import java.util.Random;

public class Banco {
	
	public static void main(String[] args) {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		// Metodo para montar e preparar dados
		preparaArrayClientes(clientes);
		
		// Metodo para realizar transacoes e forçar excessoes
		realizaTransacoesAleatorias(clientes);
		
		// Metodo para impriir extratos na tela
		imprimeExtratos(clientes);
	}
	
	public static void preparaArrayClientes(ArrayList<Cliente> clientes) {
		// Criando cliente um
		Cliente clienteUm = new PessoaFisica("Joao da Silva", 12345678, "Cafundó", 11111);
		ServicoBancario contaCorrenteUm = new ContaCorrente(clienteUm, false);
		ServicoBancario fundoInvestimentoUm = new FundoInvestimento(clienteUm, 1.2f, 0);
		clienteUm.adicionaServico(contaCorrenteUm);
		clienteUm.adicionaServico(fundoInvestimentoUm);
		
		// Criando cliente dois
		Cliente clienteDois = new PessoaJuridica("Silva do Joao", 87654321, "De Judas", 22222);
		ServicoBancario poupacaDois = new Poupanca(clienteDois, 1.2f);
		clienteDois.adicionaServico(poupacaDois);
		
		clientes.add(clienteUm);
		clientes.add(clienteDois);
	}
	
	public static void realizaTransacoesAleatorias(ArrayList<Cliente> clientes) {
		for (Cliente cliente : clientes) {
			for (ServicoBancario servico : cliente.getServicos()) {
				float valorAleatorio = geraValorAleatorio(-800, 2000);
				
				try {
					servico.efetuaDeposito(valorAleatorio);
				} catch (ExcecaoQuantiaNegativa e) {
					// Valor aleatorio pode ser negativo apenas para forçar o tratamento
					System.out.println(e.getMessage());
				}
			}
		}
	}
	
	public static void imprimeExtratos(ArrayList<Cliente> clientes) {
		for (Cliente cliente : clientes) {
			for (ServicoBancario servico : cliente.getServicos()) {
				servico.imprimirExtrato();
			}
		}
	}
	
	public static float geraValorAleatorio(int min, int max) {
		Random r = new Random();
		float random = min + r.nextFloat() * (max - min);
		
		return random;
	}
}
