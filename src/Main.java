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
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int deposit = 0;
        int investment = 15000;
        int i = 0;
        while (deposit <= 2459000) {
            deposit = deposit + investment;
            i = i + 1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + deposit + " рублей");
        }
        System.out.println("Для накопления суммы 2459000 рублей понадобится " + i + " мес.");
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a = a +1;
        }
        System.out.println();
        for (; a > 1;) {
            a = a - 1;
            System.out.print(a + " ");
        }
        System.out.println();
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int y = 12000000;
        int fertility = 17;
        int mortality = 8;
        int year = 2023;
        while (year < 2033) {
            year = year + 1;
            y = y + y/1000*fertility - y/1000*mortality;
            System.out.println("Год " + year + ", численность населения составляет " + y + " чел.");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
    int schet = 15000;
    int month = 0;
    while (schet < 12000000) {
        schet = (int) (schet * 1.07);
        month = month +1;
        System.out.println("Месяц " + month + ", сумма накоплений " + schet + " рублей.");
    }

    }
    public static void task5 () {
        System.out.println("Задача 5");
        int schet = 15000;
        int month = 0;
        while (schet < 12000000) {
            schet = (int) (schet * 1.07);
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений " + schet + " рублей.");
            }
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int schet = 15000;
        int month = 0;
        int years = 9;
        while (month < years * 12) {
            schet = (int) (schet * 1.07);
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений " + schet + " рублей.");
            }
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int friday = 2;
        int week = 7;
        while (friday < 31) {
            System.out.println("Сегодня пятница, " + friday + " число, пора делать отчёт!");
            friday = friday + week;
        }
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int currentYear = 0;
        int start = 1823;
        int finish = 2123;
        while (currentYear < finish) {
            if (currentYear > start) {
                System.out.println(currentYear);
            }
            currentYear = currentYear + 79;
        }
    }
}