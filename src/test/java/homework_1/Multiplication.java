package homework_1;

import java.util.Scanner;

public class Multiplication {
    //тип данных для первого числа
    private double x;

    public void setX(double x) {
        this.x = x;
    }

    //тип данных для второго числа
    private double y;

    public void setY(double y) {
        this.y = y;
    }

    //получение произведения чисел
    public double getMultiplication() {
        return x * y;
    }


}
