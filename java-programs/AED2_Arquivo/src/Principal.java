import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;

public class Principal {
	public static void main(String[] args) throws Exception {
		// -- Arquivos de leitura
		FileReader fr = new FileReader("teste.txt");
		BufferedReader in = new BufferedReader(fr);
		
		// -- Arquivos de escrita
		FileOutputStream outfile = new FileOutputStream("saida.txt");
		PrintStream out = new PrintStream(outfile);
		
		// -- Parametros
		int lineCounter = 0;
		int lines = getLinesCount();
		Cliente[] clientes = new Cliente[lines];
		String line;
		
		while ((line = in.readLine()) != null) {
			String[] fileData = line.split(" ");
			System.out.println("--- Linha " + (lineCounter + 1) + " ---");
			
			int cod = Integer.parseInt(fileData[0]);
			String firstName = fileData[1];
			String lastName = fileData[2];
			
			clientes[lineCounter] = new Cliente(cod, firstName, lastName);
			
			System.out.println(clientes[lineCounter].toString());
			out.println(clientes[lineCounter].toString());
			lineCounter++;
		}
		
		out.close();
		in.close();
	}
	
	public static int getLinesCount() throws Exception {
		int counter = 0;
		FileReader fr = new FileReader("teste.txt");
		BufferedReader in = new BufferedReader(fr);
		
		while (in.readLine() != null) {
			counter++;
		}
		
		in.close();
		
		return counter;
	}
}
