package com.greedy.sectio03.copy;

public class Application01 {

	public static void main(String[] args) {
		
		/*배열의 복사
		 * 1. 얕은 복사(shallow copy): stack의 주소값만 복사
		 * 2. 깊은 복사(deep copy) heap의 배열에 저장된 값을 복사*/

		//얕은 복사
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyarr = originArr;			//얕은 복사
	
		System.out.println(originArr.hashCode());
		System.out.println(copyarr.hashCode());
		
		for (int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i]+ " ");
					
		}
		System.out.println();
		
		for (int i = 0; i < copyarr.length; i++) {
			System.out.print(copyarr[i]+ " ");
	}
		System.out.println();
		
		copyarr[0] = 99;
		
		for (int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i]+ " ");
					
		}
		System.out.println();
		
		for (int i = 0; i < copyarr.length; i++) {
			System.out.print(copyarr[i]+ " ");
	}
		System.out.println();
	}
}
