package ru.bstu.iitus.vt41.dergilev_a;
import java.util.Scanner;
public class Building extends Construction {
    protected String name;
    @Override
    public void init(Scanner scanner) {
        System.out.println("Введите цену постройки здания");
        super.cost = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите название здания");
        this.name= scanner.nextLine();
    }
    @Override
    public int getConstructionCost() {
        return super.cost;
    }

    @Override
    public String toString() {
        return this.name+" Цена постройки="+super.cost;
    }
}
