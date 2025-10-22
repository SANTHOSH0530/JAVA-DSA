package JavaProgram;
import java.util.Arrays;
import java.util.Scanner;
public class fijndelement {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int nums[]= {64,25,22,12,11};
		System.out.println(Arrays.toString(nums));
		System.out.println();
		for(int i=0;i<nums.length-1;i++) {
			int min=i;
			for(int j=i+1;j<nums.length;j++) {
				if(nums[j]<nums[min]) {
					min=j;
				}
			}
			int temp=nums[min];
			nums[min]=nums[i];
			nums[i]=temp;
			System.out.println(Arrays.toString(nums));
		}
		int lb=0;
		int ub=nums.length-1;
		System.out.println();
		System.out.println("Enter the key Element :");
		int key=scan.nextInt();
		while(lb<=ub) {
			int mid=(lb+ub)/2;
			if(nums[mid]==key) {
				System.out.println(mid);
				break;
			}
			else if(nums[mid]<key) {
				lb=mid+1;
			}
			else if(nums[mid]>key) {
				ub=mid-1;
			}
		}
	}
}
