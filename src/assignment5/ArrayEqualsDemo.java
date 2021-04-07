package assignment5;

import java.util.Arrays;

public class ArrayEqualsDemo {
	
	public static void main(String[] args) {
		int [] arr1=new int[] {1,2,3};
		int [] arr2=new int[] {1,2,3};
		int [] arr3=new int[] {1,2,4};
		
		System.out.println("equal :"+Arrays.equals(arr1, arr2));
		System.out.println("equal :"+Arrays.equals(arr1, arr3));
	}

}
