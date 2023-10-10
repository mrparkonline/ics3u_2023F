import java.util.Scanner;
class Leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input
        System.out.println("Enter the year:");
        String input = sc.nextLine();
        int year = Integer.parseInt(input);
        // Processing & output
        if (year % 400 == 0) {
            System.out.println("Leap Year");
        } 
        else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not a leap year.");
        }
        sc.close();
    }
}