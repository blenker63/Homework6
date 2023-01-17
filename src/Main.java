
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            if ( i %4 == 0 && i %100 != 0 || i %400 ==0 )
            System.out.println(i + " год является високосным");
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print (i + " ");
        }
        System.out.println();
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task8() {
        System.out.println("Задача 8");
        int contribution = 29000; // инициализация суммы ежемесячного вклада
        int total = 0; // инициализация первоначальной суммы накопления
        for (int i = 1; i <= 12; i++) {
            total = total + contribution;
            System.out.println(" Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }
    }

    public static void task9() {
        System.out.println("Задача 9");
        double contribution = 29000; // инициализация суммы ежемесячного вклада
        double total = 0; // инициализация первоначальной суммы накопления
        double bankInterest = 0.12; // инициализация годового банковского процента
        double bankInterestMonth = bankInterest/12; // инициализация месячного банковского процента
        for (int i = 1; i <=12; i++) {
            total = total + total * bankInterestMonth;
            total = total + contribution;
            System.out.println(" Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }
    }
    public static void task10() {
        System.out.println("Задача 10");
        int namber = 2;
        int sum = 1;
        for (int i = 1; i <= 10; i++) {
            sum = namber * i;
            System.out.println( namber + " * " + i + " = " + sum);
        }
    }
}
