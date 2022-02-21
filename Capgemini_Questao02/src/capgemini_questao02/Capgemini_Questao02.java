package capgemini_questao02;

import java.util.Scanner;

public class Capgemini_Questao02 {

	public static void main(String[] args) {
		boolean qtdCaracteres = true, possuiDigitoNumerico = true, possuiCaractereEspecial = true, possuiLetraMaiuscula = true, possuiLetraMinuscula = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma senha:\n");
		String senha = sc.next();
		if (!verificarQuantidadeCaracteres(senha)) {
			qtdCaracteres = false;
			System.out.println("\nA sua senha possui " + senha.length() + " caracteres. Precisa ter mais " + (6 - senha.length()) + " pra ser considerada segura.");
		}
		if (!verificarPossuiDigitoNumerico(senha)) {
			possuiDigitoNumerico = false;
			System.out.println("\nA sua senha precisa ter no mínimo um dígito numérico pra ser considerada segura.");
		}
		if (!verificarPossuiCaractereEspecial(senha)) {
			possuiCaractereEspecial = false;
			System.out.println("\nA sua senha precisa ter no mínimo um caractere especial pra ser considerada segura. Os caracteres especiais são: !@#$%^&*()-+");
		}
		if (!verificarPossuiCaractereMaiusculo(senha)) {
			possuiLetraMaiuscula = false;
			System.out.println("\nA sua senha precisa ter no mínimo uma letra maiúscula pra ser considerada segura.");
		}
		if (!verificarPossuiCaractereMinusculo(senha)) {
			possuiLetraMinuscula = false;
			System.out.println("\nA sua senha precisa ter no mínimo uma letra minúscula pra ser considerada segura.");
		}
		if (qtdCaracteres == true && possuiDigitoNumerico == true && possuiCaractereEspecial == true && possuiLetraMaiuscula == true && possuiLetraMinuscula == true) {
			System.out.println("Parabens, a sua senha é segura!");
		}
	}

	//Função que verifica se a senha informada possui seis ou mais caracteres
	public static boolean verificarQuantidadeCaracteres(String senha) {
		return (senha.length() >= 6);
	}

	//Função que verifica se a senha informada possui algum digito numérico
	public static boolean verificarPossuiDigitoNumerico(String senha) {
		String numeros = "0123456789";
		for (int x = 0; x < senha.length(); x++) {
			for (int y = 0; y < numeros.length(); y++) {
				if (senha.charAt(x) == numeros.charAt(y)) {
					return true;
				}
			}
		}
		return false;
	}

	//Função que verifica se a senha informada possui algum caractere especial
	public static boolean verificarPossuiCaractereEspecial(String senha) {
		String caracteresEspeciais = "!@#$%^&*()-+";
		for (int x = 0; x < senha.length(); x++) {
			for (int y = 0; y < caracteresEspeciais.length(); y++) {
				if (senha.charAt(x) == caracteresEspeciais.charAt(y)) {
					return true;
				}
			}
		}
		return false;
	}

	//Função que verifica se a senha informada possui algum caractere maiúsculo
	public static boolean verificarPossuiCaractereMaiusculo(String senha) {
		String caracteresMaiusculos = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int x = 0; x < senha.length(); x++) {
			for (int y = 0; y < caracteresMaiusculos.length(); y++) {
				if (senha.charAt(x) == caracteresMaiusculos.charAt(y)) {
					return true;
				}
			}
		}
		return false;
	}

	//Função que verifica se a senha informada possui algum caractere minúsculo
	public static boolean verificarPossuiCaractereMinusculo(String senha) {
		String caracteresMinusculos = "abcdefghijklmnopqrstuvwxyz";
		for (int x = 0; x < senha.length(); x++) {
			for (int y = 0; y < caracteresMinusculos.length(); y++) {
				if (senha.charAt(x) == caracteresMinusculos.charAt(y)) {
					return true;
				}
			}
		}
		return false;
	}
}
