package ru.netology.javaqa.javaHomework6.services;

public class StatsService {

    public long amountSales(long[] sales) {
        long amount = 0;
        for (long i : sales) {
            amount = amount + i;
        }
        return amount;
    }

    public int averageSales(long[] sales) {
        long amount = amountSales(sales);
        return (int) amount / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                maxMonth = i; // запомним его как минимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int belowAverage(long[] sales) {
        double average = averageSales(sales);
        int month = 0;
        for (long i : sales) {
            if (i < average) {
                month++;
            }
        }
        return month;
    }

    public int aboveAverage(long[] sales) {
        double average = averageSales(sales);
        int month = 0;
        for (long i : sales) {
            if (i > average) {
                month++;
            }
        }
        return month;
    }


}
