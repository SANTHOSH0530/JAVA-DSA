package java_project_1;
import java.util.Arrays;
public class TwoDArray {
	public static void main(String[] args) {
		int[][] matrix=new int[2][3];
		 matrix[1][2]=1;
		 matrix[1][1]=2;
		 matrix[0][0]=4;
		 for(int i=0;i<matrix.length;i++) {
			 for(int j=0;j<matrix[0].length;j++) {
			 }
			 System.out.println(Arrays.toString(matrix[i]));
		 }
	}
}