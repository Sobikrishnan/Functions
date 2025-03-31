/*import java.util.Scanner;
public class Temperature {
    public static float temp(){
        String unit;
        float result;
        if (unit == "Cel"){
            result = (value*9)/5+32;
            System.out.println(result + "F");
        }
        if (unit == "Fah"){
            result = (value-32)*5/9;
            System.out.println(result + "C");
        }
    }


    public static void main(String[] args){
        Temperature temperature = new Temperature();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the unit (C/F): ");
        String unit = scanner.nextLine();

        System.out.print("Enter temperature value: ");
        float value = scanner.nextFloat();

        temp();
    }

}*/

import java.util.Scanner;

class Temperature {
    public static void convertTemp(String unit, double value) {
        if (unit.equalsIgnoreCase("C")) {
            double result = (value * 9) / 5 + 32;
            System.out.println(result + "°F");
        } else if (unit.equalsIgnoreCase("F")) {
            double result = (value - 32) * 5 / 9;
            System.out.println(result + "°C");
        } else {
            System.out.println("Invalid unit! Please enter C or F.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature unit (C/F): ");
        String unit = scanner.nextLine();

        System.out.print("Enter temperature value: ");
        double value = scanner.nextDouble();

        convertTemp(unit, value);

        scanner.close();
    }
}

