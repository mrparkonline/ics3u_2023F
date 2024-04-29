import java.util.*;
class WordCMP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        // String Array Setup
        System.out.println("Enter size of array:");
        int size = Integer.parseInt(sc.nextLine());
        String[] words1 = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter a word");
            words1[i] = sc.nextLine();
        }
        System.out.println("Enter size of array2:");
        int size2 = Integer.parseInt(sc.nextLine());
        String[] words2 = new String[size];
        for (int i = 0; i < size2; i++) {
            System.out.println("Enter a word");
            words2[i] = sc.nextLine();
        }

        // Adding all strings together from our string arrays
        String result1 = "";
        for (String word : words1) {
            result1 = result1 + word;
        }

        String result2 = "";
        for (String word : words2) {
            result2 = result2 + word;
        }

        if (result1.equals(result2)) {
            System.out.println("both words are the same");
        } else {
            System.out.println("both words are not the same");
        }

        sc.close();
    }
}