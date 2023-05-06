package com.array;

public class Array3DDemo {

	public static void main(String[] args) {
		//int [][][]arr3d=new int[3][4][3];//3x4x3 = 36
		int [][][]arr3d= {
				{
					{1,3,3},
					{1,2}
				},
				{
						{4,3,2},
						{1,5,4},
						{1,2}
				},
				{
						{1,2},
						{3},
						{4,5,6,7}
				}
			};
		for(int [][] a:arr3d) {
			for(int []b:a) {
				for(int c:b) {
					System.out.print(c+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		for(int i=0;i<arr3d.length;i++) {//dim
			for(int j=0;j<arr3d[i].length;j++) {//row
				for(int k=0;k<arr3d[i][j].length;k++) {//column
					System.out.print(arr3d[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}

}
