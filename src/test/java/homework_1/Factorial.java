package homework_1;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    //тип данных для числа
    private int x;

    public void setX(int x) {
        this.x = x;
    }

    //получение факториала числа
    public int getFactorial() {
        int result = x;
        for (int i = x - 1; i > 1; i--) {
            result = result * i;
        }
        return result;
    }
}