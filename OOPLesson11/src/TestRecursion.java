public class TestRecursion {//бесконечная рекурсия

    public static void main(String[] args) {
        someMethod();

    }

    private static void someMethod() {
        System.out.println("Hello!!!");
        someMethod();
    }
}
