public class Main {
    public static void main(String[] args) {
        String arr[] = {"a", "aba", "abc", "abba"};

        for (int i = 0; i < arr.length; i++) {
            String original = arr[i];
            String reverse = "";
            for (int j = original.length() - 1; j >= 0; j--) {
                reverse = reverse + original.charAt(j);
            }

            
            if (reverse.equals(original)) {
                System.out.println(original + " is a palindrome.");
            } else {
                System.out.println(original + " is NOT a palindrome.");
            }
        }
    }
}

