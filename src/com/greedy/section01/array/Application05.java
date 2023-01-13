package com.greedy.section01.array;

public class Application05 {

	public static void main(String[] args) {
		/*랜덤한 카드 한 장을 뽑아서 출력*/
		String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
		String[] cardNumbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE",};

		int radomShapeIndex = (int) (Math.random() * shapes.length);
		int radomCardNumbers = (int)(Math.random() * cardNumbers.length);
	
		System.out.println("당신이 뽑은 카드는 " +  shapes[radomShapeIndex] + " " + cardNumbers[radomCardNumbers]+ "입니다.");
	}

}
