package com.array;

public class Array2DDemo {

	public static void main(String[] args) {
		  int [][]arr = {
				{40, 30, 20},
				{4,3,5,6,7},
				{1,2}, 
				{5,6,7,5}
			};
		
		System.out.println("No of Rows: "+arr.length);
		System.out.println("No of Columns in 1st Row:"+arr[2].length);
		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		for(int []abc:arr) {
			for(int x:abc) {
				System.out.print(x+" ");
			}
			System.out.println();
		}
		
	}

}
