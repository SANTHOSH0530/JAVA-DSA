package DsaJavaProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInsertPosition {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Array Size :");
		int size=scan.nextInt();
		int nums[]=new int[size];
		for(int i=0;i<size;i++) {
			nums[i]=scan.nextInt();
		}
		for(int i=0;i<nums.length-1;i++) {
			for(int j=0;j<nums.length-1-i;j++) {
				if(nums[j]>nums[j+1]) {
					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
		System.out.print("target :");
		int key=scan.nextInt();
		int lb=0;
		int ub=nums.length-1;
		while(lb<=ub) {
			int mid=(lb+ub)/2;
			if(mid==key) {
				System.out.println(mid);
			}else if(nums[mid]<key) {
				lb=mid+1;
			}else {
				ub=mid-1;
			}
		}
		System.out.println("Index Element :"+lb);
	}
}
