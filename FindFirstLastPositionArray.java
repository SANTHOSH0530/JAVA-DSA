package DsaJavaProgramming;
import java.util.Scanner;
public class FindFirstLastPositionArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Array Size :");
		int size=scan.nextInt();
		int nums[]=new int[size];
		System.out.print("Enter the Array Elements :");
		for(int i=0;i<size;i++) {
			nums[i]=scan.nextInt();
		}
		System.out.print("Enter the target Value :");
		int target=scan.nextInt();
		int[] result=searchnumber(nums,target);
		System.out.println("Output :"+"["+result[0]+"]"+"["+result[1]+"]");
	}
	 public static int[] searchnumber(int[] nums,int target) {
		int first=findfirst(nums,target);
		int last=findlast(nums,target);
		return new int[] {first,last};
	}
	 private static int findfirst(int[] nums,int target) {
		 int lb=0;
	     int ub=nums.length-1;
	     int ans=-1;
	     while(lb<=ub){
	         int mid=(lb+ub)/2;
	            if(nums[mid]==target){
	                ans=mid;
	                ub=mid-1;
	            }else if(nums[mid]<target){
	                lb=mid+1;
	            }else{
	                ub=mid-1;
	            }
	        }
	        return ans;
	 }
	 private static int findlast(int[] nums,int target) {
		 int lb=0;
	     int ub=nums.length-1;
	     int ans=-1;
	     while(lb<=ub){
	         int mid=(lb+ub)/2;
	            if(nums[mid]==target){
	                ans=mid;
	                lb=mid+1;
	            }else if(nums[mid]<target){
	                lb=mid+1;
	            }else{
	                ub=mid-1;
	            }
	        }
	        return ans;
	 }
}
