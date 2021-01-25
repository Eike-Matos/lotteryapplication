package entities;

import java.util.Random;

public class LotteryApplication {
	
	private int [] lotteryNumbers;
	private int [] userLotteryNumbers;
	
	public void getUserLotteryNumbers( int [] userLotteryNumbersGiven) {
		userLotteryNumbers = userLotteryNumbersGiven;
	}
	
	public int [] compareLotteryNumbers() {
		int[] matchedNumbers = new int [lotteryNumbers.length];
				
		for(int currentUserLotteryNumberIndex = 0; currentUserLotteryNumberIndex < userLotteryNumbers.length; currentUserLotteryNumberIndex ++) {
			if (userLotteryNumbers[ currentUserLotteryNumberIndex] == lotteryNumbers[ currentUserLotteryNumberIndex ] ) {
	        }
		}
	}
	
	public LotteryApplication( int numberOfLotteryNumbers) {
		Random random = new Random();
		
		lotteryNumbers = new int [numberOfLotteryNumbers];
		
		for(int currentLotteryNumberIndex = 0; currentLotteryNumberIndex < lotteryNumbers.length; currentLotteryNumberIndex++) {
			lotteryNumbers [ currentLotteryNumberIndex] = random.nextInt (10);
		}
		
	}
	
	

}
