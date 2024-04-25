import java.util.*;
class SpecialEvent {
    public static void main(String[] args) {
        // Special Events
        Scanner sc = new Scanner(System.in);
        // Setup:
        System.out.println("Input the Number of people invited.");
        int people = Integer.parseInt(sc.nextLine());
        int[] days = {0,0,0,0,0}; // For availability
        for (int i = 0; i < people; i++) {
            System.out.println("Input the Person's availability:");
            String schedule = sc.nextLine(); 
            // Would Input: Y.Y.. as an example
            char[] temp = schedule.toCharArray();
            for (int j = 0; j < temp.length; j++) {
                if (temp[j] == 'Y') {
                    days[j] += 1;
                }
            }
        }
        // Finding the optimal day
        int best_day = 0;
        int attending = 0;
        for (int day = 0; day < days.length; day++) {
            int current_attending = days[day];
            if (current_attending > attending) {
                best_day = day;
                attending = current_attending;
            }
        }
        // Check for ties
        int counter = 0;
        for (int day = 0; day < days.length; day++) {
            int current_attending = days[day];
            if (current_attending == attending) {
                System.out.println("Day" + (day+1) + " is an optimal day.");
                counter += 1;
            }
        }
        sc.close();
    }
}
