package JavaProgram;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayinsertion {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int size= scan.nextInt();
		int arr[]=new int[size+1];
		for(int i=0;i<size;i++)
			arr[i]=scan.nextInt();
		System.out.println(Arrays.toString(arr));
		int pos=scan.nextInt();
		int ele=scan.nextInt();
		for(int i=size-1;i>=pos-1;i--)
			arr[i+1]=arr[i];
		arr[pos-1]=ele;
		System.out.print(Arrays.toString(arr));	
	}
}
