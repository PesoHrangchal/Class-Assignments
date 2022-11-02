package array;

import java.util.Scanner;

//class assignment 01/11/22
//Q3. We need to print the elements of the array which are present in the odd position
public class Odd_Position {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter five elements in an array:");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements in the odd position are:");
		for(int j=0;j<5;j++) {
			if(j%2==0) {
				System.out.print(arr[j]+" ");
			}
		}
	}
}
