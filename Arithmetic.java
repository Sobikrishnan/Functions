public class Arithmetic {
    public static int add(int a, int b){
        return a+b; }

    public static int difference(int a, int b){
        return a-b; }

    public static int product(int a, int b){
        return a*b; }

    public static int quotient(int a, int b){
        return a/b; }

    public static void main(String[] args){
        Arithmetic arithmetic = new Arithmetic();

        int sum = Arithmetic.add(5,10);
        System.out.println("Sum: " + sum);

        int difference = Arithmetic.difference(10, 2);
        System.out.println("Difference: " + difference);

        int product = Arithmetic.product(10, 2);
        System.out.println("Product: " + product);

        int quotient = Arithmetic.quotient(10, 3);
        System.out.println("Quotient: " + quotient);

    }
}

