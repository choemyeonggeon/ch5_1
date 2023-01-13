package com.greedy.sectio03.copy;

import java.util.Arrays;
import java.util.Iterator;

public class Application03 {

	public static void main(String[] args) {
		/*깊은 복사
		 *1. for문을 이용한 동일한 인덱스 값 복사
		 *2. object의 clone()을 이용한 복사
		 *System의 arraycopy()를 이용한 복사		//성능은 가장 좋음
		 *Array의 copyOf()를 이용한 복사			//가장 많이 사용*/
		
		int[] origiArr = new int[] {1, 2, 3, 4, 5};
		
		print(origiArr);
		
		//1. for문을 이용한 방법
		int[] copyArr1 = new int[10];
		
		for (int i = 0; i < origiArr.length; i++) {
			copyArr1[i] = origiArr[i];
		}
		print(copyArr1);
		
		//2. object의 clone()을 이용한 복사
		int[] copyArr2 = origiArr.clone();
		copyArr2[0] = 99;
		print(origiArr);
		print(copyArr2);
		
		//3. system의 arraycopy()를  이용한 복사
		int[] copyArr3 = new int[10];
		
		//원본배열, 복사를 시작할 인덱스, 복사본 배열, 복사를 시작할 인덱스, 복사할 길이
		System.arraycopy(origiArr, 0, copyArr3,3,origiArr.length);
		
		print(copyArr3);
		
		//4. Arrays의 copyOf()를 이용한 복사
		int[] copyArr4 = Arrays.copyOf(origiArr, 7);
		
		print(copyArr4);
		
	}
	public static void print(int[] iarr) {
		System.out.println("iarr의 hashcode :" + iarr.hashCode());
		
		for(int i = 0; i < iarr.length; i++) {
			System.out.print(iarr[i]+ " ");
		}
		System.out.println();
}
}
