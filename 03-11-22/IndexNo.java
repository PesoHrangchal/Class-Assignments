package class_assignment;

import java.util.*;
public class IndexNo {
  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of elements in the array:");
      int n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter "+n+" elements:");
      for(int i=0;i<arr.length;i++){
         arr[i]=sc.nextInt();
      }
      
      System.out.println("Enter an element to search in the array:");
      int element=sc.nextInt();
      boolean flag=false;
      
      for(int j=0;j<arr.length;j++){
          if(element==arr[j]){
          flag=true;
          System.out.println(element+" is at index number "+j);
          }
      }
      
      if(flag==false)
      System.out.println(element+" not found in the array!");
  }
}
