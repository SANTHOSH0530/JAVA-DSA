package DsaJavaProgramming;
import java.util.Scanner;
public class Arraydeletion {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Array Size :");
		int size=scan.nextInt();
		int nums[]=new int[size];
		System.out.print("Enter the "+size+" elements :");
		for(int i=0;i<size;i++) {
			nums[i]=scan.nextInt();
		}
		System.out.print("Enter the Delete Position :");
		int position=scan.nextInt();
		for(int i=position;i<size-1;i++) {
			nums[i]=nums[i+1];
		}
		size--;
		for (int i = 0; i < size; i++) {
		    System.out.print(nums[i] + " ");
		}

	}
}
