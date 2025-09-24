package JavaProgram;
import java.util.Scanner;
public class MergeTwoSortedArrays {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the 1st Array Size :");
		int size1=scan.nextInt();
		int nums1[]=new int[size1];
		for(int i=0;i<size1;i++) {
			System.out.print("Enter the "+size1+" Sorted Order :");
			nums1[i]=scan.nextInt();
		}
		System.out.print("Enter the 2nd Array Size :");
		int size2=scan.nextInt();
		int nums2[]=new int[size2];
		for(int i=0;i<size2;i++) {
			System.out.print("Enter the "+size2+" Sorted Order :");
			nums2[i]=scan.nextInt();
		}
		int merged[]=new int[size1+size2];
		int i=0;
		int j=0;
		int k=0;
		while(i<size1 && j<size2) {
			if(nums1[i]<=nums2[j]) {
				merged[k++]=nums1[i++];
			}else {
				merged[k++]=nums2[j++];
			}
		}
		while(i<size1) {
			merged[k++]=nums1[i++];
		}
		while(j<size2) {
			merged[k++]=nums2[j++];
		}
		
		System.out.println("Merged Array :");
		for(int num:merged) {
			System.out.print(num+" ");
		}
	}
}
