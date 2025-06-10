/*
ALUNOS {
	Andrey Nery dos Santos
	Antonio
	Cristiano
	Lucas Souza
}
*/
package lpa;

import java.util.Scanner;

public class Main {
	public static char[][] tabuleiro = new char[3][3];
	public static char jogadorAtual = 'X';

	public static void main(String[] args) {

		int rodada = 1;
		System.out.println(" *** JOGO DA VELHA *** ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tabuleiro[i][j] = '_';
			}
		}

		while (true) {
			System.out.println("Rodada " + rodada);
			mostrarTabuleiro();
			jogada();
			if (verificarVitoria()) {
				mostrarTabuleiro();
				System.out.println("O jogador " + jogadorAtual + " venceu!");
				break;
			}
			if (verificarEmpate()) {
				mostrarTabuleiro();
				System.out.println("O jogo deu velha!");
				break;
			}
			trocarJogador();
			rodada++;
		}
	}

	public static void mostrarTabuleiro() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(tabuleiro[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void jogada() {
		Scanner sc = new Scanner(System.in);
		int linha, coluna;
		while (true) {
			System.out.println("");
			System.out.println("Jogada atual: " + jogadorAtual);
			System.out.print("Insira a linha que deseja jogar: ");
			linha = sc.nextInt() - 1;
			System.out.print("Insira a coluna que deseja jogar: ");
			coluna = sc.nextInt() - 1;
			if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == '_') {
				tabuleiro[linha][coluna] = jogadorAtual;
				break;
			} else {
				System.out.println("Jogada inválida. Tente novamente!");
			}
		}
	}

	public static void trocarJogador() {
		if (jogadorAtual == 'X') {
			jogadorAtual = 'O';
		} else {
			jogadorAtual = 'X';
		}
	}

	public static boolean verificarVitoria() {

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

	public static boolean verificarEmpate() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (tabuleiro[i][j] == '_') {
					return false;
				}
			}
		}
		return true;
	}
}