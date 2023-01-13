package com.greedy.sectio03.copy;

public class Application02 {

	public static void main(String[] args) {

		String[] names = {"홍길동", "유관순", "이순신"};
		
		System.out.println("name의 hashcode :" + names.hashCode());
		
	
		print(names);
		
		String[] animals = getAnimals();
		
		System.out.println("리턴받은 animals의 hashcode :" + animals.hashCode());
		
		print(animals);
	}
	
	
	public static void print(String[] sarr) {
		
		System.out.println("sarr의 hashcode :" + sarr.hashCode());
		
		for (int i = 0; i < sarr.length; i++) {
			System.out.print(sarr[i]+ " ");
			
		}
		System.out.println();
	}
	
	public static String[] getAnimals() {
		
		String[] animals = new String[] {"낙타", "호랑이", "나무늘보"};
		
		System.out.println("새로 만든 animals의 hashcode :" + animals.hashCode());
		
		return animals;
	}

}
