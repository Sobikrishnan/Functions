public class Functions {

    public static int add(int num1, int num2){
        return num1 + num2;
    }


    public static void main(String[] args){

        int sum = add(5, 10);
        System.out.println("The sum of 5 and 10 is: " + sum);
        greet("Alice");
    }

    public static void greet(String name){
        System.out.println("Hello, " + name + "!");

    }
}
