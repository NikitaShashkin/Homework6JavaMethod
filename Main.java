import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Random randomizer = new Random();

        int number1 = randomizer.nextInt(0,1000);
        int number2 = randomizer.nextInt(0,1000);
        System.out.println("Рандомное число номер 1 = " + number1);
        System.out.println("Рандомное число номер 2 = " + number2);

        calculator.add(number1, number2);
        calculator.subtract(number1,number2);
        calculator.multiply(number1,number2);
        calculator.divide(number1,number2);


    }
}