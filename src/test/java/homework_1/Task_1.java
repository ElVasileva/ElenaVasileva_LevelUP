package homework_1;

import sun.print.SunMinMaxPage;

import java.awt.*;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Task_1 app = new Task_1();
        app.startTask_1();
    }

    public void startTask_1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите операцию: \n" +
                "\"+\" для сложения, \n" +
                "\"-\" для вычитания, \n" +
                "\"*\" для умножения, \n" +
                "\"^\" для возведения в степень числа, \n" +
                "\"!\" для вычисления факториала числа, \n" +
                "\"f\" для вычисления значения заданного числа Фибонначи \n" +
                "\"x\" для выхода");
        String operation = scanner.nextLine();
        if ("+".equals(operation)) {
            Sum sum = new Sum();
            System.out.println("Введите первое число: ");
            sum.setX(scanner.nextDouble());
            System.out.println("Введите второе число: ");
            sum.setY(scanner.nextDouble());
            System.out.println("Результат: " + sum.getSum());
        } else if ("-".equals(operation)) {
            Diff diff = new Diff();
            System.out.println("Введите первое число: ");
            diff.setX(scanner.nextInt());
            System.out.println("Введите второе число: ");
            diff.setY(scanner.nextInt());
            System.out.println("Результат: " + diff.getDiff());
        } else if ("*".equals(operation)) {
            Multiplication multiplication = new Multiplication();
            System.out.println("Введите первое число: ");
            multiplication.setX(scanner.nextDouble());
            System.out.println("Введите второе число: ");
            multiplication.setY(scanner.nextDouble());
            System.out.println("Результат: " + multiplication.getMultiplication());
        } else if ("^".equals(operation)) {
            Exponentiation exponentiation = new Exponentiation();
            System.out.println("Введите первое число: ");
            exponentiation.setX(scanner.nextDouble());
            System.out.println("Введите второе число: ");
            exponentiation.setY(scanner.nextInt());
            System.out.println("Результат: " + exponentiation.getExp());
        } else if ("!".equals(operation)) {
            Factorial factorial = new Factorial();
            System.out.println("Введите число: ");
            factorial.setX(scanner.nextInt());
            System.out.println("Результат: " + factorial.getFactorial());
        } else if ("f".equals(operation)) {
            Fibonacci fibonacci = new Fibonacci();
            System.out.println("Введите число: ");
            fibonacci.setX(scanner.nextInt());
            System.out.println("Результат: " + fibonacci.getFibonacci());
        } else if ("x".equals(operation)) {
            return;
        }


    }
}
