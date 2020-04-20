package homework_1;

import java.awt.*;
import java.util.Scanner;

public class Diff {
    //тип данных для первого числа
    private int x;

    public void setX(int x) {
        this.x = x;
    }

    //тип данных для второго числа
    private int y;

    public void setY(int y) {
        this.y = y;
    }

    //получение разницы чисел
    public double getDiff() {
        return x - y;
    }


}



