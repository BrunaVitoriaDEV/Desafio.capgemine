package capgemini_questao03;

import java.util.Arrays;
import java.util.Scanner;

public class Capgemini_Questao03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma string para a verificação de pares de anagramas:\n===============================\n");
		String palavra = sc.next();
		comparaSubstrings(retornarSubstrings(palavra));
	}

	//Função que retorna todas as substrings da string de entrada
	public static SubstringsOrdenadas retornarSubstrings(String texto) {
		SubstringsOrdenadas substrings = new SubstringsOrdenadas();
		for (int x = 0; x < texto.length() + 1; x++) {
			for (int y = x; y < texto.length() + 1; y++) {
				if (!texto.substring(x, y).equals("")) {
					substrings.substrings.add(texto.substring(x, y));
					int[] indice = {x, y};
					substrings.indices.add(indice);
				}
			}
		}
		return substrings;
	}

	//Função que compara duas substrings e mostra se uma e anagrama da outra
	public static void comparaSubstrings(SubstringsOrdenadas substrings) {
		System.out.println("Pares de substrings que sao anagramas:\n");
		for (int x = 0; x < substrings.substrings.size(); x++) {
			char[] tmpx = substrings.substrings.get(x).toCharArray();
			Arrays.sort(tmpx);
			for (int y = x; y < substrings.substrings.size(); y++) {
				char[] tmpy = substrings.substrings.get(y).toCharArray();
				Arrays.sort(tmpy);
				if (Arrays.equals(tmpx, tmpy) && x != y) {
					System.out.println(substrings.substrings.get(x) + " - " + Arrays.toString(substrings.indices.get(x))
						+ " e " + substrings.substrings.get(y) + " - " + Arrays.toString(substrings.indices.get(y)));
					System.out.println("=============================");
				}
			}
		}
	}

}
