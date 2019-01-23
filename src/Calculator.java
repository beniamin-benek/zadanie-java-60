class Calculator {

    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void calculate() {
        if (a > b) {
            int sum = a + b;
            System.out.println("Suma liczb: " + sum);
        } else if (a < b) {
            int product = a * b;
            System.out.println("Iloczyn: " + product);
        } else {
            int square = a * b;
            System.out.println("Kwadrat: " + square);
        }
    }
}