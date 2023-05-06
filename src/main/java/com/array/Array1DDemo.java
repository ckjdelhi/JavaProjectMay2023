package com.array;

public class Array1DDemo {

	public void arrayPrint() {
		System.out.println("hi");
	}
	
	public static void main(String[] args) {
		int a1=4;
		int a2=5;
		int a3=3;
		int a4=5;
		int a5=6;
		
		int arr[] = new int[5];
		arr[0]= 5;
		arr[1]= 3;
		arr[2]= 4;
		arr[3]= 2;
		arr[4]= 5;
		
		//System.out.println(arr[2]);
		int i=0;
		while(i<arr.length) {
			System.out.println(arr[i]);
			i++;
		}
		
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
		int index=0;
		for(int x : arr) {
			System.out.println(x);
			System.out.println(arr[index]);
			index++;
		}
		
		String []strArr2 = {"A", "B","C","D"};
		for(String s : strArr2) {
			System.out.println(s);
		}
		
		String []strArr = new String[6];
		strArr[0]="A";
		strArr[1]="B";
		strArr[2]="C";
		strArr[3]="D";
		strArr[4]="E";
		strArr[5]="F";
		//strArr[6]="G";//Error: ArrayIndexOutOfBoundsException
		for(String s : strArr) {
			System.out.println(s);
		}
		
		
		int arr1[]= {1,2,3,4}; //new int[4]; arr1[0]=1;arr1[1]=2;
		System.out.println(arr1.length);
		System.out.println(arr1[3]);
		arr1[4]=5;
		
	}

}
