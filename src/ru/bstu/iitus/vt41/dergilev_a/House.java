package ru.bstu.iitus.vt41.dergilev_a;
import  java.util.Scanner;
public class House extends  Construction{
    protected float area;
    @Override
    public void init(Scanner scanner) {
        System.out.println("Введите цену постройки дома");
        super.cost = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите площадь дома");
        this.area = scanner.nextFloat();
        scanner.nextLine();
    }

    @Override
    public int getConstructionCost() {
        return super.cost;
    }

    @Override
    public String toString() {
        return super.cost+" Площадь дома="+this.area;
    }
}
