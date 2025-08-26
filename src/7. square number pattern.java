class Main {
    public static void main(String[] args) {
        int n = 5;
        int size = 2 * n - 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int top = i;
                int bottom = size - 1 - i;
                int right = j;
                int left = size - 1 - j;
                int min = Math.min(top, Math.min(bottom, Math.min(right, left)));
                int val = n - min;

                System.out.print(val + " ");
            }
            System.out.println();

        }
    }
}
