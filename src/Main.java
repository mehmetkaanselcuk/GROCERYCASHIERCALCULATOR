import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pear = 2.14, apple = 3.67, tomato = 1.11, banana = 0.95, eggplant = 5.00;
        double kg, total;
        System.out.print("How many kg of pear?: ");
        kg = input.nextDouble();
        total = kg * pear;
        System.out.print("How many kg of apple?: ");
        kg = input.nextDouble();
        total = total + (kg * apple);
        System.out.print("How many kg of tomato?: ");
        kg = input.nextDouble();
        total = total + (kg * tomato);
        System.out.print("How many kg of banana?: ");
        kg = input.nextDouble();
        total = total + (kg * banana);
        System.out.print("How many kg of eggplant?: ");
        kg = input.nextDouble();
        total = total + (kg * eggplant);
        System.out.println("Total price: " + total + " TL");
    }
}
