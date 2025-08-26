class Main {
    public static void main(String args[]) {
        int number[] = { 2, 3, 5, 6, 8, 9, 4, 3 };
        int target = 9;

        int index = LinearSearch(number, target);
        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println(index);
        }
    }

    public static int LinearSearch(int n[], int t) {
        for (int i = 0; i < n.length; i++) {
            if (n[i] == t) {
                return i;
            }
        }
        return -1;

    }
}
