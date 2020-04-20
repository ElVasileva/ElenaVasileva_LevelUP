package homework_1;

import java.util.Scanner;

public class Exponentiation {
    //тип данных для первого числа
    private double x;

    public void setX(double x) {
        this.x = x;
    }

    //тип данных для второго числа
    private int y;

    public void setY(int y) {
        this.y = y;
    }

    //возведение числа в степень
    public double getExp() {
        if (y == 0) {
            return 1.0;
        }
        double result = x;

        for (int i = 1; i < Math.abs(y); i++) {
            result = result * x;

        }
        if (y < 0) {
            return 1 / result;
        } else {
            return result;
        }
    }


}
