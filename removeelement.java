package JavaProgram;
import java.util.Scanner;
public class removeelement {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int nums[]=new int[size];
		for(int i=0;i<size;i++) {
			nums[i]=scan.nextInt();
		}
		int i=0,j=0;
		while(j<size) {
			if(nums[i]!=nums[j]) {
				i++;
				nums[i]=nums[j];
			}
			j++;
		}
		 System.out.println(i+1);
	}
}
