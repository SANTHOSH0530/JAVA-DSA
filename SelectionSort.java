package SortingPrograms;
import java.util.Arrays;
public class SelectionSort {
	public static void main(String[] args) {
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
			int temp=nums[i];
			nums[i]=nums[min];
			nums[min]=temp;
			System.out.println(Arrays.toString(nums));
		}
	}
}
