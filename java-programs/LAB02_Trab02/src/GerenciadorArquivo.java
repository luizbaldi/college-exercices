
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class GerenciadorArquivo {
	private String caminhoArquivo;

	GerenciadorArquivo(String caminhoArquivo) {
		this.caminhoArquivo = caminhoArquivo;
	}
	
	public void imprimirArquivo() throws IOException {
		FileReader fileIn = new FileReader(this.caminhoArquivo);
		BufferedReader bufferedReader = new BufferedReader(fileIn);
		
		String linha;
		while ((linha = bufferedReader.readLine()) != null) {
			System.out.println(linha);
		}
		
		bufferedReader.close();
	}

	public void adicionarNoArquivo(String elemento) throws IOException {
		FileWriter fileWriter = new FileWriter(new File(caminhoArquivo));
		BufferedWriter bufWriter = new BufferedWriter(fileWriter);
		bufWriter.write(elemento);
		bufWriter.close();
	}
	
	public static File getFile(String caminhoArquivo) {
		return new File(caminhoArquivo);
	}

}
