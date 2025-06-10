package lpa;

import java.util.Scanner;

public class NoWayItsMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char[] linha1 = new char[3];
		char[] linha2 = new char[3];
		char[] linha3 = new char[3];
		int i, j;
		int linha, coluna;
		boolean vitoria = false;

		for (i = 0; i < 3; i++) {
			linha1[i] = '-';
			linha2[i] = '-';
			linha3[i] = '-';
		}

		System.out.println(" *** JOGO DA VELHA *** ");
		System.out.println();
		System.out.println(linha1[0] + " " + linha1[1] + " " + linha1[2]);
		System.out.println(linha2[0] + " " + linha2[1] + " " + linha2[2]);
		System.out.println(linha3[0] + " " + linha3[1] + " " + linha2[2]);

		while (vitoria != true) {

			if (vitoria == false) {
				System.out.println();
				System.out.println(" *** [Jogador X] *** ");
				System.out.println();
				System.out.print("Digite a linha que deseja jogar: ");
				linha = sc.nextInt();
				System.out.print("Digite a coluna que deseja jogar: ");
				coluna = sc.nextInt();
				System.out.println();

				if (linha == 1 & coluna == 1) {
					linha1[0] = 'X';
				} else if (linha == 1 & coluna == 2) {
					linha1[1] = 'X';
				} else if (linha == 1 & coluna == 3) {
					linha1[2] = 'X';
				} else if (linha == 2 & coluna == 1) {
					linha2[0] = 'X';
				} else if (linha == 2 & coluna == 2) {
					linha2[1] = 'X';
				} else if (linha == 2 & coluna == 3) {
					linha2[2] = 'X';
				} else if (linha == 3 & coluna == 1) {
					linha3[0] = 'X';
				} else if (linha == 3 & coluna == 2) {
					linha3[1] = 'X';
				} else if (linha == 3 & coluna == 3) {
					linha3[2] = 'X';
				}

				System.out.println(linha1[0] + " " + linha1[1] + " " + linha1[2]);
				System.out.println(linha2[0] + " " + linha2[1] + " " + linha2[2]);
				System.out.println(linha3[0] + " " + linha3[1] + " " + linha3[2]);

				if (linha1[0] == 'X' && linha1[1] == 'X' && linha1[2] == 'X'
						|| linha1[0] == 'O' && linha1[1] == 'O' && linha1[2] == 'O') {
					System.out.println(" *** VITÓRIA *** ");
					vitoria = true;
				} else if (linha2[0] == 'X' && linha2[1] == 'X' && linha2[2] == 'X'
						|| linha2[0] == 'O' && linha2[1] == 'O' && linha2[2] == 'O') {
					System.out.println(" *** VITÓRIA *** ");
					vitoria = true;
				} else if (linha3[0] == 'X' && linha3[1] == 'X' && linha3[2] == 'X'
						|| linha3[0] == 'O' && linha3[1] == 'O' && linha3[2] == 'O') {
					System.out.println(" *** VITÓRIA *** ");
					vitoria = true;
				} else if (linha1[0] == 'X' && linha2[0] == 'X' && linha3[0] == 'X'
						|| linha1[0] == 'O' && linha2[0] == 'O' && linha3[0] == 'O') {
					System.out.println(" *** VITÓRIA *** ");
					vitoria = true;
				} else if (linha1[1] == 'X' && linha2[1] == 'X' && linha3[1] == 'X'
						|| linha1[1] == 'O' && linha2[1] == 'O' && linha3[1] == 'O') {
					System.out.println(" *** VITÓRIA *** ");
					vitoria = true;
				} else if (linha1[2] == 'X' && linha2[2] == 'X' && linha3[2] == 'X'
						|| linha1[2] == 'O' && linha2[2] == 'O' && linha3[2] == 'O') {
					System.out.println(" *** VITÓRIA *** ");
					vitoria = true;
				} else if (linha1[0] == 'X' && linha2[1] == 'X' && linha3[2] == 'X'
						|| linha1[0] == 'O' && linha2[1] == 'O' && linha3[2] == 'O') {
					System.out.println(" *** VITÓRIA *** ");
					vitoria = true;
				} else if (linha1[2] == 'X' && linha2[1] == 'X' && linha3[0] == 'X'
						|| linha1[2] == 'O' && linha2[1] == 'O' && linha3[0] == 'O') {
					System.out.println(" *** VITÓRIA *** ");
					vitoria = true;
				}
			}

			if (vitoria == false) {
				System.out.println();
				System.out.println("[Jogador O]");
				System.out.println();
				System.out.print("Digite a linha que deseja jogar: ");
				linha = sc.nextInt();
				System.out.print("Digite a coluna que deseja jogar: ");
				coluna = sc.nextInt();
				System.out.println();

				if (linha == 1 & coluna == 1) {
					if (linha1[0] != 'X') {
						linha1[0] = 'O';
					}
				} else if (linha == 1 & coluna == 2) {
					if (linha1[1] != 'X') {
						linha1[1] = 'O';
					}
				} else if (linha == 1 & coluna == 3) {
					if (linha1[2] != 'X') {
						linha1[2] = 'O';
					}
				} else if (linha == 2 & coluna == 1) {
					if (linha2[0] != 'X') {
						linha2[0] = 'O';
					}
				} else if (linha == 2 & coluna == 2) {
					if (linha2[1] != 'X') {
						linha2[1] = 'O';
					}
				} else if (linha == 2 & coluna == 3) {
					if (linha2[2] != 'X') {
						linha2[2] = 'O';
					}
				} else if (linha == 3 & coluna == 1) {
					if (linha3[0] != 'X') {
						linha3[0] = 'O';
					}
				} else if (linha == 3 & coluna == 2) {
					if (linha3[1] != 'X') {
						linha3[1] = 'O';
					}
				} else if (linha == 3 & coluna == 3) {
					if (linha3[2] != 'X') {
						linha3[2] = 'O';
					}
				}

				System.out.println(linha1[0] + " " + linha1[1] + " " + linha1[2]);
				System.out.println(linha2[0] + " " + linha2[1] + " " + linha2[2]);
				System.out.println(linha3[0] + " " + linha3[1] + " " + linha3[2]);
				System.out.println();

				if (linha1[0] == 'X' && linha1[1] == 'X' && linha1[2] == 'X'
						|| linha1[0] == 'O' && linha1[1] == 'O' && linha1[2] == 'O') {
					System.out.println(" *** VITÓRIA *** ");
					vitoria = true;
				} else if (linha2[0] == 'X' && linha2[1] == 'X' && linha2[2] == 'X'
						|| linha2[0] == 'O' && linha2[1] == 'O' && linha2[2] == 'O') {
					System.out.println(" *** VITÓRIA *** ");
					vitoria = true;
				} else if (linha3[0] == 'X' && linha3[1] == 'X' && linha3[2] == 'X'
						|| linha3[0] == 'O' && linha3[1] == 'O' && linha3[2] == 'O') {
					System.out.println(" *** VITÓRIA *** ");
					vitoria = true;
				} else if (linha1[0] == 'X' && linha2[0] == 'X' && linha3[0] == 'X'
						|| linha1[0] == 'O' && linha2[0] == 'O' && linha3[0] == 'O') {
					System.out.println(" *** VITÓRIA *** ");
					vitoria = true;
				} else if (linha1[1] == 'X' && linha2[1] == 'X' && linha3[1] == 'X'
						|| linha1[1] == 'O' && linha2[1] == 'O' && linha3[1] == 'O') {
					System.out.println(" *** VITÓRIA *** ");
					vitoria = true;
				} else if (linha1[2] == 'X' && linha2[2] == 'X' && linha3[2] == 'X'
						|| linha1[2] == 'O' && linha2[2] == 'O' && linha3[2] == 'O') {
					System.out.println(" *** VITÓRIA *** ");
					vitoria = true;
				} else if (linha1[0] == 'X' && linha2[1] == 'X' && linha3[2] == 'X'
						|| linha1[0] == 'O' && linha2[1] == 'O' && linha3[2] == 'O') {
					System.out.println(" *** Vitória *** ");
					vitoria = true;
				} else if (linha1[2] == 'X' && linha2[1] == 'X' && linha3[0] == 'X'
						|| linha1[2] == 'O' && linha2[1] == 'O' && linha3[0] == 'O') {
					System.out.println(" *** VITÓRIA *** ");
					vitoria = true;
				}
			}

		}

		sc.close();

	}

}