package DsaJavaProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Array Size :");
		int size=scan.nextInt();
		int nums[]=new int[size];
		System.out.print("Enter the "+size+" elements :");
		for(int i=0;i<size;i++) {
			nums[i]=scan.nextInt();
		}
		System.out.print("Enter the Rotate Position :");
		int k=scan.nextInt();
		k=k%nums.length;
		int rotated[]=new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			rotated[(i+k)%nums.length]=nums[i];
		}
		for(int i=0;i<nums.length;i++) {
			nums[i]=rotated[i];
		}
		System.out.println(Arrays.toString(nums));
	}
}
