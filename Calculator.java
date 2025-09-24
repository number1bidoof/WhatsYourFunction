public class Calculator {
    // Method overloading
    public static double multiply (double a, double b){ // a method that multiplies 2 doubles
        return a * b;
    }
    public static int multiply(int c, int d ){ // a method that multiplies 2 integers
        return c * d;
    }
    public static int multiply(int e, int f, int j){ // a method that multiplies 3 integers
        return e * f * j;
    }
    public static String multiply(int k , String l) { // a method that multiples strings
        return l.repeat(k);
    }
    public static void main(String[] args) {
        System.out.println("Two ints: " + multiply(5, 3));
        System.out.println("Three ints: " + multiply(5, 3, 2));
        System.out.println("Two doubles: " + multiply(5.5, 3.2));
        System.out.println("Int and string: " + multiply(3, "Hi!"));
    }
}
