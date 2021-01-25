package entities;

import java.util.Random;

public class LotteryApplication {
	
	private int [] lotteryNumbers;
	private int [] userLotteryNumbers;
	
	public void getUserLotteryNumbers( int [] userLotteryNumbersGiven) {
		userLotteryNumbers = userLotteryNumbersGiven;
	}
	
	public int [] getLotteryNumbers() {
		return lotteryNumbers;
	}
	
	public int [] compareLotteryNumbers() {
		int[] matchedNumbers = new int [lotteryNumbers.length];
		
		for (int currentMatchedNumberIndex = 0; currentMatchedNumberIndex < matchedNumbers.length; currentMatchedNumberIndex ++) {
			matchedNumbers[ currentMatchedNumberIndex ] = -1;
		}
				
		for(int currentUserLotteryNumberIndex = 0; currentUserLotteryNumberIndex < userLotteryNumbers.length; currentUserLotteryNumberIndex ++) {
			if (userLotteryNumbers[ currentUserLotteryNumberIndex] == lotteryNumbers[ currentUserLotteryNumberIndex ] ) {
				matchedNumbers[ currentUserLotteryNumberIndex ] = userLotteryNumbers[ currentUserLotteryNumberIndex];
	        }
		}
		
		return matchedNumbers;
	}
	
	public LotteryApplication( int numberOfLotteryNumbers) {
		Random random = new Random();
		
		lotteryNumbers = new int [numberOfLotteryNumbers];
		
		for(int currentLotteryNumberIndex = 0; currentLotteryNumberIndex < lotteryNumbers.length; currentLotteryNumberIndex++) {
			lotteryNumbers [ currentLotteryNumberIndex] = random.nextInt (10);
		}
		
	}
	
	

}
