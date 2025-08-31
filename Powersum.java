import java.util.Scanner;
class PowerSum {
    public boolean powerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        PowerSum obj = new PowerSum();
        if (obj.powerOfThree(num)) {
            System.out.println(num + " is a power of 3");
        } else {
            System.out.println(num + " is NOT a power of 3");
        }
    }
}
