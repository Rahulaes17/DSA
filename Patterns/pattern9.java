class Pattern9 {
    public void result1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            ;

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            ;

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            ;
            System.out.println();
        }
    }

    public void result2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern9 res = new Pattern9();
        res.result1(5);
        res.result2(5);
    }
}
