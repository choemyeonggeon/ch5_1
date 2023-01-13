package com.greedy.section01.array;

import java.util.Scanner;

public class Application04 {

	public static void main(String[] args) {

		/*5명의 자바 점수를  정수로 입력받아서 합계와 평균을 실수로 구하는 프로그램이다.
		 * */

		int[] scores = new int[5];
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < scores.length; i++) {
			System.out.println((i +1 ) + "번쨰 학생의 자바 점수를 입력해주세요 :");
			scores[i] = sc.nextInt();
		}
		double sum = 0.0;
		double avg = 0.0;
		
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
			
		}
		avg = sum /scores.length;
		System.out.println("sum :" + sum);
		System.out.println("avg :" + avg);
}

}
