package ru.bstu.iitus.vt41.dergilev_a;
import java.util.Scanner;
public class ApartmentBuilding extends House {
 private int countOfFloors;

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);
        System.out.println("Введите количество этажей");
        this.countOfFloors=scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public String toString() {
        return  "Многоквартирный дом, количество этажей="+this.countOfFloors+ " цена постройки="+super.toString();
    }
}
