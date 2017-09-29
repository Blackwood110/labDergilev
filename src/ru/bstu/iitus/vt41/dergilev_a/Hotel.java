package ru.bstu.iitus.vt41.dergilev_a;
import java.util.Scanner;
public class Hotel extends Building {
    private int countOfRooms;
    @Override
    public void init(Scanner scanner) {
        super.init(scanner);
        System.out.println("Введите количество номеров");
        this.countOfRooms=scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public String toString() {
        return  "Отель "+ super.toString() +"Количество номеров="+ this.countOfRooms;
    }
}
