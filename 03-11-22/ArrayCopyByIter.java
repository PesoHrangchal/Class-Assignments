package class_assignment;
import java.util.*;
public class ArrayCopyByIter {
  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of elements in the array:");
      int n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter "+n+" elements:");
      System.out.println("Elements of the array:");
      for(int i=0;i<arr.length;i++){
         arr[i]=sc.nextInt();
         System.out.print(arr[i]);
      }
      System.out.println();
      int arr1[]=new int[n];
      System.out.println("Elements of the array is copied to new array.");
      System.out.println("Elements of the new array:");
      for(int j=0;j<arr.length;j++){
          arr1[j]=arr[j];
          System.out.print(arr1[j]);
      }
      System.out.println();
      System.out.print("Old array equal to new array:");
      System.out.print(arr==arr1);
      }
}
