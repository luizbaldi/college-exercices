
public class Principal {
	public static void main(String[] args) {
		Concessionaria con = new Concessionaria();
		
		//testaConcessionaria(con);
		
		new InterfaceGrafica(con).setVisible(true);
	}
	
	public static void testaConcessionaria(Concessionaria con) {
		Automovel a1 = new Automovel(CorAutomovel.PRETO, ModeloAutomovel.FERRARI_458, 2015);
		Automovel a2 = new Automovel(CorAutomovel.BRANCO, ModeloAutomovel.PALIO_YOUNG, 2002);
		
		Peca p1 = new Peca(EstadoPeca.NOVA, TipoPeca.VELA_IGNICAO);
		Peca p2 = new Peca(EstadoPeca.USADA, TipoPeca.PASTILHA_FREIO);
		
		con.adicionaAutomovel(a1);
		con.adicionaAutomovel(a2);
		con.adicionaPeca(p1);
		con.adicionaPeca(p2);
		
		System.out.println(con.getNotaFiscal());
	}
}
