import java.util.ArrayList;

public class StringOps {
	private ArrayList<Character> unrepeatedChars;
	private Integer[] countOfChar;
	private char[] messageToCharArr;

	StringOps(String message) {
		messageToCharArr = message.toCharArray();
		unrepeatedChars = makeArrListFromCharArray(messageToCharArr);
		countOfChar = countCharRepetitionFromList(unrepeatedChars, messageToCharArr);
		sortListDescCharRepetition(unrepeatedChars, countOfChar);
	}

	public ArrayList<Character> makeArrListFromCharArray(char[] messageToCharArr) {
		ArrayList<Character> caracteres = new ArrayList<>();
		for (char c : messageToCharArr) {
			if (!(caracteres.contains(c)))
				caracteres.add(c);
		}
		return caracteres;
	}

	public Integer[] countCharRepetitionFromList(ArrayList<Character> unrepeatedChars, char[] messageToCharArr) {
		Integer[] countOfChar = new Integer[unrepeatedChars.size()];
		for (int i = 0; i < countOfChar.length; i++) {
			countOfChar[i] = 0;
		}
		for (int i = 0; i < unrepeatedChars.size(); i++) {
			char comparador = unrepeatedChars.get(i);
			for (int j = 0; j < messageToCharArr.length; j++) {
				if (comparador == messageToCharArr[j])
					countOfChar[i]++;
			}
		}
		return countOfChar;
	}

	public void sortListDescCharRepetition(ArrayList<Character> unrepeatedChars, Integer[] countOfChar) {
		for (int i = 0; i < countOfChar.length; i++) {
			for (int j = 0; j < countOfChar.length - 1; j++) {
				if (countOfChar[j] < countOfChar[j + 1]) {
					Integer aux = new Integer(countOfChar[j]);
					countOfChar[j] = countOfChar[j + 1];
					countOfChar[j + 1] = aux;
					char auxChar = unrepeatedChars.get(j);
					unrepeatedChars.set(j, unrepeatedChars.get(j + 1));
					unrepeatedChars.set(j+1, auxChar);
				}
			}
		}
	}

	public ArrayList<Character> getUnrepeatedChars() {
		return unrepeatedChars;
	}

	public Integer[] getCountOfChar() {
		return countOfChar;
	}

	public char[] getMessageToCharArr() {
		return messageToCharArr;
	}

}
