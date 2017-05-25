package lab05;

import javax.swing.JOptionPane;

public class Aplicacao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			NovaData D1 = new NovaData();
			//Data D2 = new Data(200, 12, 2010);
			
			System.out.println("Data padrao:" + D1.getDia() + "/" + D1.getMes()
					+ "/" + D1.getAno());
			if (D1.anoBisexto())
				System.out.println("Ano e Bisexto");
			else
				System.out.println("Ano nao e Bisexto");
			//D1 = null;
			//float j = 10 / 0;
			System.out.println("Data padrao:" + D1.getDia() + "/" + D1.getMes()
					+ "/" + D1.getAno());
			
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "A data não foi inicializada", "Data não inicializada", JOptionPane.ERROR_MESSAGE);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Ate logo!");
		}
	}
	
	
	
	
	
	
	
	

}
