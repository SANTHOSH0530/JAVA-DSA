package JavaProgram;
import java.util.Arrays;
import java.util.Scanner;
public class ArraySquareSum {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int nums[]=new int[size];
		for(int i=0;i<size;i++) {
			nums[i]=scan.nextInt();
		}
		for(int i=0;i<nums.length;i++) {
			nums[i]=nums[i]*nums[i];
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < nums.length - 1; i++) {          
            for (int j = 0; j < nums.length - 1 - i; j++) {   
                if (nums[j] > nums[j + 1]) {                    
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
           }
		}
		System.out.println(Arrays.toString(nums));
	}
}