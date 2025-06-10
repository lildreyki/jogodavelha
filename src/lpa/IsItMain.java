package lpa;

import java.util.Scanner;

public class IsItMain {

	public static void main(String[] args) {
		
		/*
		Alunos { // turma 3
			Andrey Nery dos Santos;
			Antônio;
			Cristiano;
			Lucas Souza;
		*/
		
		
		Scanner sc = new Scanner(System.in);
		int i, j;
		
		// informações
		System.out.println("*** JOGO DA VELHA ***");
		System.out.println("Regras básicas:");
		System.out.println("Quem formar 3 letras primeiro, ganha.");
		System.out.println("Pode ser na vertical, horizontal ou diagonal.");
		System.out.println("Basta escolher entre as linhas e colunas (1 a 3).");
		// informações
		
		System.out.print("Digite 'sim', para iniciar o jogo: ");
		String status = sc.nextLine();
		
		do {
			System.out.println("Digite seu nome:");
			String jogador1 = sc.nextLine();
			System.out.println("Qual o nome do jogador 2?");
			String jogador2 = sc.nextLine();
			System.out.print(jogador1+" - Digite qual letra deseja ser (X ou O): ");
			char letra = sc.next().charAt(0);
			char jogador1letra, jogador2letra;
			if (letra == 'X') {
				jogador1letra = 'X';
				jogador2letra = 'O';
			} else {
				jogador1letra = 'O';
				jogador2letra = 'X';
			}
			System.out.println("");
			
			char[][] jogo = new char[3][3];
			
			for (i = 0; i < 1; i++) {
				for (j = 0; j < jogo.length; j++) {
					jogo[i][j] = '-';
					System.out.println(jogo[i][j] + " " + jogo[i][j] + " " + jogo[i][j]);
				}
				System.out.println("");
			}
			
			boolean vitoria = false;
			while (vitoria != true) {
				
				System.out.println("Vez do jogador: " + letra);
				System.out.println("Digite em qual linha deseja jogar: ");
				int linha = sc.nextInt();
				System.out.println("Digite em qual coluna deseja jogar: ");
				int coluna = sc.nextInt();
				
				if (linha == 1) {
					if (coluna == 1) {
						jogo[0][0] = letra;
					} else if (coluna == 2) {
						jogo[1][0] = letra;
					} else if (coluna == 3) {
						jogo[2][0] = letra;
					} else {
						System.out.println("Posição inválida, tente novamente.");
					}
				}
				if (linha == 2) {
					if (coluna == 1) {
						jogo[0][1] = letra;
					} else if (coluna == 2) {
						jogo[1][1] = letra;
					} else if (coluna == 3) {
						jogo[2][1] = letra;
					} else {
						System.out.println("Posição inválida, tente novamente.");
					}
				}
				if (linha == 3) {
					if (coluna == 1) {
						jogo[0][2] = letra;
					} else if (coluna == 2) {
						jogo[1][2] = letra;
					} else if (coluna == 3) {
						jogo[2][2] = letra;
					} else {
						System.out.println("Posição inválida, tente novamente.");
					}
				}
				
				for (i = 0; i < 1; i++) {
					for (j = 0; j < 3; j++) {
						System.out.println(jogo[i][j] + " " + "-" + " " + "-");
					}
					System.out.println("");
				}
				
//				for (i = 0; i < jogo.length; i++) {
//					for (j = 0; j < jogo.length; j++) {
//						if (vet[0][j] & ) {
//							i++;
//						}
//					}
//				}
			}
			
		} while (status.equals("sim"));
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
