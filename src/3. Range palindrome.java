class Main {
    public static void main(String args[]) {
        for (int i = 0; i <= 100; i++) {
            boolean IsPalindrome = palindrom(i);

            if (IsPalindrome) {
                System.out.println(i + "is palindrome");
            } else {
                System.out.println(i + "is not palindrome");
            }
        }

    }

    public static boolean palindrom(int n) {
        int c = n;
        int r = 0;
        int s = 0;
        while (n > 0) {
            r = n % 10;
            s = (s * 10) + r;
            n = n / 10;
        }
        if (c == s) {
            return true;
        } else {
            return false;
        }
    }
}
