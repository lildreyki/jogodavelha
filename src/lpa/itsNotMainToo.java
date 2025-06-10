package lpa;

import java.util.Scanner;

public class itsNotMainToo {
	private static char[][] tabuleiro = new char[3][3];
	private static char jogadorAtual = 'X';

	public static void main(String[] args) {
		inicializarTabuleiro();
		while (true) {
			imprimirTabuleiro();
			jogadorFazJogada();
			if (verificarVitoria()) {
				imprimirTabuleiro();
				System.out.println("Jogador " + jogadorAtual + " venceu!");
				break;
			}
			if (verificarEmpate()) {
				imprimirTabuleiro();
				System.out.println("O jogo empatou!");
				break;
			}
			alternarJogador();
		}
	}

	private static void inicializarTabuleiro() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tabuleiro[i][j] = '-';
			}
		}
	}

	private static void imprimirTabuleiro() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(tabuleiro[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void jogadorFazJogada() {
		Scanner scanner = new Scanner(System.in);
		int linha, coluna;
		while (true) {
			System.out.println("Jogador " + jogadorAtual + ", insira sua jogada (linha e coluna): ");
			linha = scanner.nextInt() - 1;
			coluna = scanner.nextInt() - 1;
			if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == '-') {
				tabuleiro[linha][coluna] = jogadorAtual;
				break;
			} else {
				System.out.println("Esta jogada nÃ£o Ã©️ vÃ¡lida. Tente novamente.");
			}
		}
	}

	private static void alternarJogador() {
		jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
	}

	private static boolean verificarVitoria() {

		for (int i = 0; i < 3; i++) {
			if (tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual) {
				return true;
			}
		}

		for (int j = 0; j < 3; j++) {
			if (tabuleiro[0][j] == jogadorAtual && tabuleiro[1][j] == jogadorAtual && tabuleiro[2][j] == jogadorAtual) {
				return true;
			}
		}
		if (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) {
			return true;
		}
		if (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual) {
			return true;
		}
		return false;
	}

	private static boolean verificarEmpate() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (tabuleiro[i][j] == '-') {
					return false;
				}
			}
		}
		return true;
	}
}