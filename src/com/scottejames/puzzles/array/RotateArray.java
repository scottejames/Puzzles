package com.scottejames.puzzles.array;

import java.util.Arrays;

public class RotateArray {

	public static int[] rotateArrayListNewArray(int[] a, int size) {

		int[] result = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			int index = (i + 2) % a.length;

			result[index] = a[i];
		}
		return result;
	}

	
	// This is a more efficient approach than above, 
	// assuming you want to rotate an array 1,2,3,4,5,6 by 2
	// 0. Rotate the whole array: 6,5,4,3,2,1
	// 1. Divide the array two parts: 6,5  & 4,3,2,1
	// 2. Rotate first part: 5,6
	// 3. Rotate second part: 1,2,3,4 
	// which leaves 5,6,1,2,3,4 tada
	
	public static void partialRotateArray(int[] a, int start, int end) {
		while (start < end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		
	}

	public static void rotateArrayInPlace(int[] a, int size){
		partialRotateArray(a, 0, a.length - 1);
		partialRotateArray(a, 0, size - 1); // Reverse first part (4,3 -> 3,4)
		partialRotateArray(a, size, a.length - 1); //Reverse second part (2,1,0 -> 0,1,2)
	}
	public static void main(String[] args) {

		int[] a = new int[10];
		for (int i = 0; i < 10; i++) {
			a[i] = i;

		}

		int[] result = rotateArrayListNewArray(a, 2);

		System.out.println(Arrays.toString(result));
		rotateArrayInPlace(a,2);
		System.out.println(Arrays.toString(a));

		
	}
}
