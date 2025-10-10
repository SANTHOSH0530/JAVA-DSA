package StringPracticeQuestions;
import java.util.Scanner;
public class StringBuilderMethodsDemo {
	public static void main(String[] args) {
		 // Constructor
        StringBuilder sb = new StringBuilder("Hello");
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter your initial string: ");
        String input = sc.nextLine();

        // Create StringBuilder with user input
        StringBuilder sb1 = new StringBuilder(input);
        // 1. Append
        sb1.append(" World");
        System.out.println("After append: " + sb1);

        // 2. Insert
        sb1.insert(6, "Java ");
        System.out.println("After insert: " + sb1);

        // 3. Replace
        sb1.replace(6, 10, "Awesome");
        System.out.println("After replace: " + sb1);

        // 4. Delete
        sb1.delete(6, 13);
        System.out.println("After delete: " + sb1);

        // 5. Reverse
        sb1.reverse();
        System.out.println("After reverse: " + sb1);

        // 6. setCharAt
        sb1.setCharAt(0, '*');
        System.out.println("After setCharAt: " + sb1);

        // 7. setLength
        sb1.setLength(8);
        System.out.println("After setLength(8): " + sb1);

        // 8. charAt
        char ch = sb1.charAt(2);
        System.out.println("Character at index 2: " + ch);

        // 9. substring
        String substr = sb1.substring(1, 5);
        System.out.println("Substring(1,5): " + substr);

        // 10. length and capacity
        System.out.println("Length: " + sb1.length());
        System.out.println("Capacity: " + sb1.capacity());

        // 11. ensureCapacity
        sb1.ensureCapacity(100);
        System.out.println("Capacity after ensureCapacity(100): " + sb1.capacity());
		
	}
}
