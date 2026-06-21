class pattern1 {
    public void result(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.err.println();
        }
    }

    public static void main(String[] args) {
        pattern1 res = new pattern1();
        res.result(5);
    }
}

