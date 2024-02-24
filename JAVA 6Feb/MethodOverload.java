 class MethodOverload {
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        int sum1 = MethodOverload.add(5, 10);
        double sum2 = MethodOverload.add(3.14, 2.71);
        int sum3 = MethodOverload.add(1, 2, 3);

        System.out.println("Sum 1: " + sum1);
        System.out.println("Sum 2: " + sum2);
        System.out.println("Sum 3: " + sum3);
    }
}