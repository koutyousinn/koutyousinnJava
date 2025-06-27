package main.java.jp.co.kou;

public class Day0626 {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		int position = search(array, 5);
		System.out.println(position);
	}
	public static int search(int[] array, int number) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				return i;
			}
		}
		System.out.println("nai");
		return -1;
		
	}
}
