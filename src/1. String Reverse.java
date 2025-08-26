class Main {
    public static void main(String[] args) {
        String str = "Vanshika";
        System.out.println(Rever(str));
    }

    public static String Rever(String me) {
        String Reverse = "";
        int l = me.length();
        for (int i = l - 1; i >= 0; i--) {
            Reverse = Reverse + me.charAt(i);
        }
        return Reverse;
    }
}