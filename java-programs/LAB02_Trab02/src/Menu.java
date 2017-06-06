import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.Gson;

public class Menu {
	private StringOps sops;
	private HuffmanTree huffTree;
	private GerenciadorArquivo file;
	public static Gson gson = new Gson();
	
	public void cryptText(String text) throws IOException {
		setSops(new StringOps(text));
		setHuffTree(new HuffmanTree());
		getHuffTree().buildLeafNodesLinkedList(sops.getUnrepeatedChars(), sops.getCountOfChar());
		getHuffTree().treeMaker(getHuffTree().getRoot(), getHuffTree().getEnd());
		String unrepeatedChars = Menu.gson.toJson(getSops().getUnrepeatedChars());
		String countOfChars = Menu.gson.toJson(getSops().getCountOfChar());
		String codedString = unrepeatedChars + "\n" +  countOfChars + "\n" + getHuffTree().treeToHuffmanCode(sops.getUnrepeatedChars(), sops.getCountOfChar(), sops.getMessageToCharArr());
		setFile(new GerenciadorArquivo("file.txt"));
		FileReader fileIn = new FileReader("file.txt");
		BufferedReader br = new BufferedReader(fileIn);
		getFile().adicionarNoArquivo(codedString);
		System.out.println("\tTexto salvo com sucesso");
		br.close();
	}
	
	public void decryptText() throws IOException {
		setFile(new GerenciadorArquivo("file.txt"));
		FileReader fileIn = new FileReader("file.txt");
		BufferedReader br = new BufferedReader(fileIn);
		String unrepeatedCharsFile = br.readLine();
		String countOfCharsFile = br.readLine();
		String codedStringFile = br.readLine();
		ArrayList<Character> unrepeatedCharsLs = new ArrayList<>(Arrays.asList(gson.fromJson(unrepeatedCharsFile, Character[].class)));
		Integer[] countOfCharsLs = Menu.gson.fromJson(countOfCharsFile, Integer[].class);
		setHuffTree(new HuffmanTree());
		getHuffTree().buildLeafNodesLinkedList(unrepeatedCharsLs, countOfCharsLs);
		getHuffTree().treeMaker(getHuffTree().getRoot(), getHuffTree().getEnd());
		String decodedString = getHuffTree().huffmanCodeToText(codedStringFile, getHuffTree().getNewRoot());
		System.out.println("\tTexto descriptografado: " + decodedString);
		br.close();
	}
	
	public StringOps getSops() {
		return sops;
	}
	public HuffmanTree getHuffTree() {
		return huffTree;
	}
	public void setSops(StringOps sops) {
		this.sops = sops;
	}
	public void setHuffTree(HuffmanTree huffTree) {
		this.huffTree = huffTree;
	}
	public GerenciadorArquivo getFile() {
		return file;
	}
	public void setFile(GerenciadorArquivo file) {
		this.file = file;
	}
}