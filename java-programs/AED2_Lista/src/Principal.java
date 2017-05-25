
public class Principal {
	
	public static void main(String[] args) {
		Lista l1 = new Lista();
		
		for (int i=0; i < 6; i++) {
			try {
				l1.inserirFim(i);
			} catch (ListaException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
