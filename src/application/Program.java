package application;

import java.util.Scanner;

import entities.Dados;
import entities.LotteryApplication;


public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final int NUMBER_OF_LOTTERY_NUMBERS = 6;
		int userLotteryNumber;
		int [] userLotteryNumbers = new int[ NUMBER_OF_LOTTERY_NUMBERS ];
		int [] matchedNumbers = new int [ NUMBER_OF_LOTTERY_NUMBERS ];
		int [] lotteryNumbers = new int [ NUMBER_OF_LOTTERY_NUMBERS ];
		int numberOfMatchedNumbers = 0;
		
		LotteryApplication megaSena = new LotteryApplication( NUMBER_OF_LOTTERY_NUMBERS);
		
		Dados dados = new Dados();
		System.out.println("Qual seu nome?");
		String nome = sc.nextLine();
		System.out.println("Qual seu e-mail?");
		String email = sc.nextLine();
		System.out.println("Seja bem vindo a Mega Sena" + " " + nome + " "+ email );
		System.out.println("Fa�a sua aposta!");
		
		System.out.println();
		
		for(int currentLotteryNumberIndex = 0; currentLotteryNumberIndex < NUMBER_OF_LOTTERY_NUMBERS; currentLotteryNumberIndex ++) {
			System.out.println("Digite o primeiro desejado n� " + (currentLotteryNumberIndex + 1) );
			userLotteryNumber = sc.nextInt();
			userLotteryNumbers[ currentLotteryNumberIndex ] = userLotteryNumber;
		}
		
		megaSena.getUserLotteryNumbers(userLotteryNumbers);
		matchedNumbers = megaSena.compareLotteryNumbers();
		lotteryNumbers = megaSena.getLotteryNumbers();
		
		System.out.println("Os n�meros da Mega Sena de hoje s�o: ");
		for(int currentLotteryNumberIndex = 0; currentLotteryNumberIndex < lotteryNumbers.length; currentLotteryNumberIndex ++) {
			System.out.print( lotteryNumbers[ currentLotteryNumberIndex ] + ", ");
		}
		
		System.out.println();
		
		System.out.println("Os seus n�meros da Mega Sena escolhidos foram: ");
		for(int currentUserLotteryNumberIndex = 0; currentUserLotteryNumberIndex < userLotteryNumbers.length; currentUserLotteryNumberIndex ++) {
			System.out.print( userLotteryNumbers[ currentUserLotteryNumberIndex ] + ", ");
		}
		
		System.out.println();
		
		System.out.println("N�meros acertados: ");
		for (int currentMatchedNumberIndex = 0; currentMatchedNumberIndex < matchedNumbers.length; currentMatchedNumberIndex ++) {
			if( matchedNumbers[ currentMatchedNumberIndex ] != -1) {
				System.out.println( matchedNumbers [currentMatchedNumberIndex] + " (Posi��o " + (currentMatchedNumberIndex + 1) + "), ");
				numberOfMatchedNumbers += 1;
			}	
		}
		
		if(numberOfMatchedNumbers == NUMBER_OF_LOTTERY_NUMBERS) {
			System.out.println("Parab�ns! Voc� ganhou o pr�mio de R$ 12 milh�es!!!");
		} else if ( numberOfMatchedNumbers == 1) {
			System.out.println("Voc� acertou " + numberOfMatchedNumbers + " n�mero.");
		} else {
			System.out.println("Voc� acertou " + numberOfMatchedNumbers + " n�meros.");
		}

	}

}
