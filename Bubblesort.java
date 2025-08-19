import java.util.Arrays;
public class Bubblesort {
    public static void main(String[] args) {
        int[] a = {5, 3, 8, 4, 2};
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length - 1; i++) {          
            for (int j = 0; j < a.length - 1 - i; j++) {   
                if (a[j] > a[j + 1]) {                    
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        } 
        System.out.println(Arrays.toString(a));
    }
}
