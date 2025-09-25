package SortingProgram;
import java.util.Scanner;
public class BinarySearch {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a[]= {10,20,30,40,50,60,70};
		System.out.println("Enter the Key Value :");
		int key=scan.nextInt();
		int lb=0;
		int flag=0;
		int ub=a.length-1;
		while(lb<=ub) { 
			int mid=(lb+ub)/2;
			if(a[mid]==key) {
				flag=1;
				System.out.println("Index Value is :"+mid);
				break;
			}else if(a[mid]<key) {
				lb=mid+1;
			}else if(a[mid]>key) {
				ub=mid-1;
			}
		}
		if(flag==0) {
			System.out.println("Element Not Found ");
		}
	}
}

