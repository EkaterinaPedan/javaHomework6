package ru.netology.javaqa.javaHomework6.services;

public class StatsService {

    public long amountSales(long[] sales) {
        long amount = 0;
        for (long i : sales) {
            amount = amount + i;
        }
        return amount;
    }

    public long averageSales(long[] sales) {
        long amount = amountSales(sales);
        return amount / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int belowAverage(long[] sales) {
        long average = averageSales(sales);
        int month = 0;
        for (long sale : sales) {
            if (sale < average) {
                month++;
            }
        }
        return month;
    }

    public int aboveAverage(long[] sales) {
        long average = averageSales(sales);
        int month = 0;
        for (long sale : sales) {
            if (sale > average) {
                month++;
            }
        }
        return month;
    }


}
