package homework_1;

public class Fibonacci {
    //тип данных для числа
    private int x;

    public void setX(int x) {
        this.x = x;
    }

    //получение числа Фибоначчи
    public int getFibonacci() {
        if (x < 0) {
            System.out.println("Введено некорректное значение");
            return 0;
        }
        int n0 = 1;
        int n1 = 1;
        int n2 = 0;
        for (int i = 3; i <= x; i++) {
            n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
        }
        return n1;
    }

}