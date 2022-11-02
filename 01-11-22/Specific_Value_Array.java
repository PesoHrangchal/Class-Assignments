package array;

import java.util.Scanner;

//class assignment 01/11/22
//Q1. Write a Java program to test if an array contains a specific value
public class Specific_Value_Array {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter five elements in an array:");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter element to search:");
		int search=sc.nextInt();
		boolean flag = false;
		for(int a=0;a<5;a++) {
			if(arr[a]==search) {
				flag=true;
				break;
			}else {
				continue;
			}
		}
			if(flag==true)
				System.out.println(search+" is present in the array.");
			else
				System.out.println(search+" is not present in the array.");
		}
	}
