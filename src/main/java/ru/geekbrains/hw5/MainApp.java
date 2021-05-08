package ru.geekbrains.hw5;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {


        Worker[] workers =
                {new Worker("Василий", "Котломойщик", "вася@list.ru", "+7911-777-77-71", 12000, 37),
                        new Worker("Иван", "Грузчик", "иван@list.ru", "+7911-777-77-72", 18000, 35),
                        new Worker("Антон", "Бармен", "антон@list.ru", "+7911-777-77-73", 30000, 27),
                        new Worker("Сергей", "Повар", "серега@list.ru", "+7911-777-77-74", 25000, 44),
                        new Worker("Максим", "Официант", "макс@list.ru", "+7911-777-77-75", 15000, 41)
                };

        for (int i = 0; i < workers.length; i++) {
            if (workers[i].age > 40) {
                workers[i].info();
            }
            System.out.println("");
    }
    }
}
