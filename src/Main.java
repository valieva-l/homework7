public class Main {
    public static void main(String[] args) {
        //Задача 1
        int monthlySavings = 15000;
        int totalSavings = 0;
        int month = 0;
        while (totalSavings < 2_459_000) {
            month = month + 1;
            totalSavings = totalSavings + monthlySavings;
            System.out.println("Месяц " + month + " ,сумма накоплений равна " + totalSavings + " рублей");
        }
        //Задача 2 Первая строчка
        for (int b = 1; b <= 10; b++) {
            System.out.print(" " + b);
        }
        System.out.println();
        //Вторая строчка
        int a = 10;
        while (a >= 1) {
            System.out.print(" " + a);
            a = a - 1;
        }
        System.out.println();
        //Задача 3
        int y = 12_000_000;
        int birthRate = 17;
        int mortalityRate = 8;
        for (int year = 1; year < 10; year++) {
            y += y * (birthRate - mortalityRate) / 1000;
            System.out.println("Год " + year + " , численность населения составляет " + y);
        }
        //Задача 4
        int monthlySavingsOne = 15000;
        double totalSavingsOne = 0;
        int monthOne = 0;
        while (totalSavingsOne < 12_000_000) {
            totalSavingsOne = totalSavingsOne + totalSavingsOne * 1.07;
            totalSavingsOne = totalSavingsOne + monthlySavingsOne;
            monthOne++;
            System.out.println(totalSavingsOne);
            System.out.println(monthOne);
        }
        //Задача 5
        int monthlySavingsTwo = 15000;
        double totalSavingsTwo = 0;
        int monthTwo = 0;
        while (totalSavingsTwo < 12_000_000) {
            totalSavingsTwo = totalSavingsTwo + totalSavingsTwo * 1.07;
            totalSavingsTwo = totalSavingsTwo + monthlySavingsTwo;
            monthTwo = monthTwo + 6;
            System.out.println(totalSavingsTwo);
            System.out.println(monthTwo);
        }
        //Задача 6
        int monthlySavingsThree = 15000;
        double totalSavingsThree = 0;
        int monthThree = 0;
        while (monthThree < 108) {
            totalSavingsThree = totalSavingsThree + totalSavingsThree * 1.07;
            totalSavingsThree = totalSavingsThree + monthlySavingsThree;
            monthThree = monthThree + 6;
            System.out.println(totalSavingsThree);
            System.out.println(monthThree);
        }
        //Задача 7
        int currentYear = 2025;
        int pastYears = 200;
        int comingYears = 100;
        for (int theFlightOfTheComet = 0; theFlightOfTheComet < currentYear + comingYears; theFlightOfTheComet = theFlightOfTheComet + 79) {
            if (theFlightOfTheComet > currentYear - pastYears) System.out.println(theFlightOfTheComet);
        }
    }
}
