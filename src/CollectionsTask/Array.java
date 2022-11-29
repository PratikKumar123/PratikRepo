package CollectionsTask;

import java.util.Scanner;
//Create a method which accepts an integer array and removes all the duplicates in the array.
//Return the resulting array in descending order

public class Array {
	
	public static void  duplicate (int[] array, int n) {
		int swap;
		//lets  sort in descending order
		for(int i=0;i<n;i++) {
			for(int j =0; j<n-1;j++) {
				if(array[j]<array[j+1]) {
					swap =array[j];
					array[j]=array[j+1];
					array[j+1]=swap;
					
				}
			}
		}
		
		//removing duplicate 
		
		int[] store = new int[n];
		int j =0;
		
		for(int i=0;i<n-1;i++) {
			if(array[i]!=array[i+1]) {
				store[j++]=array[i];
			}
			
		}
		store[j++]=array[n-1];
		
		
		for(int i =0;i<j;i++) {
			array[i]=store[i];
			System.out.println(store[i]);
		}
		
		
		
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int numbers = sc.nextInt();
		int[] arr= new int[numbers];
		int length = arr.length;
		for(int i =0;i<numbers; i++) {
			
			arr[i]=sc.nextInt();
		}
		
		 duplicate(arr,length);

	}

}
