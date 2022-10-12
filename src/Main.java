import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String firstStr = input.nextLine();
        int length = firstStr.length();
        int half = length / 2;
        System.out.println("String length: " + length + "\nFirst half: " + firstStr.substring(0, half) + "\nSecond half: " + firstStr.substring(half));

        System.out.print("\nEnter second string: ");
        String secondStr = input.nextLine();
        if (length == secondStr.length()) {
            System.out.println("Both strings are the same length.");

            if (firstStr.equals(secondStr)) {
                System.out.println("Both strings have the same characters");
            }
        } else {
            System.out.println((length > secondStr.length() ? firstStr : secondStr) + " is longer");
        }

        System.out.println((firstStr.compareTo(secondStr) < 0 ? firstStr : secondStr) + " is first alphabetically.");

        if (firstStr.contains(secondStr)) {
            System.out.println(secondStr + " is found in " + firstStr + " at index " + firstStr.indexOf(secondStr));
        } else {
            System.out.println(secondStr + " is not found in " + firstStr);
        }
    }
}