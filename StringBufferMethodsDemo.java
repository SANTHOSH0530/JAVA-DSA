package StringPracticeQuestions;

public class StringBufferMethodsDemo {
	public static void main(String[] args) {
		// Constructor
        StringBuffer sb = new StringBuffer("Java");
        // 1. Append
        sb.append(" Programming");
        System.out.println("After append: " + sb);

        // 2. Insert
        sb.insert(5, "Language ");
        System.out.println("After insert: " + sb);

        // 3. Replace
        sb.replace(5, 13, "Core ");
        System.out.println("After replace: " + sb);

        // 4. Delete
        sb.delete(0, 5);
        System.out.println("After delete: " + sb);

        // 5. Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // 6. setCharAt
        sb.setCharAt(0, '!');
        System.out.println("After setCharAt: " + sb);

        // 7. setLength
        sb.setLength(10);
        System.out.println("After setLength(10): " + sb);

        // 8. charAt
        System.out.println("charAt(2): " + sb.charAt(2));

        // 9. substring
        String sub = sb.substring(2, 6);
        System.out.println("substring(2,6): " + sub);

        // 10. length and capacity
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());

        // 11. ensureCapacity
        sb.ensureCapacity(100);
        System.out.println("Capacity after ensureCapacity(100): " + sb.capacity());

        // 12. trimToSize (Java 1.5+)
        sb.trimToSize();
        System.out.println("Capacity after trimToSize(): " + sb.capacity());
	}
}
