public class PangramChecker {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter a string to check if it is a pangram: ");
        String input = sc.nextLine().toLowerCase();
        boolean[] mark = new boolean[26];
        int index;

        for (int i = 0; i < input.length(); i++) {
            if ('a' <= input.charAt(i) && input.charAt(i) <= 'z') {
                index = input.charAt(i) - 'a';
                mark[index] = true;
            }
        }

        boolean isPangram = true;
        for (int i = 0; i < 26; i++) {
            if (!mark[i]) {
                isPangram = false;
                break;
            }
        }

        if (isPangram) {
            System.out.println("The input string is a pangram.");
        } else {
            System.out.println("The input string is not a pangram.");
        }
    }
}