package ru.bstu.iitus.vt41.dergilev_a;

import java.util.Scanner;

public class Restaurant extends Building {
    private int countOfTables;

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);
        System.out.println("Введите количество столиков");
        this.countOfTables=scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public String toString() {
        return  "Ресторан "+ super.toString()+" количество столиков="+this.countOfTables;
    }
}
