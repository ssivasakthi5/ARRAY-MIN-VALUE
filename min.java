package day3;

import java.util.Scanner;

public class min {
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a array size: ");
	 int a=s.nextInt();
	 
	int arr[] = new int[a];
	 System.out.println("Enter a array "+a+" values: ");
	 for(int j=0;j<a;j++) {
		 arr[j]=s.nextInt();	
		 
	 }
	 int  min=arr[0];
	for(int i=1;i<arr.length;i++) {
		
		if(min>arr[i]) {
			min=arr[i];
			
		}
		
		
	}System.out.println(min);
}
}
