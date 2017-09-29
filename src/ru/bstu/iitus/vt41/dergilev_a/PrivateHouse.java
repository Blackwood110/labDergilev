package ru.bstu.iitus.vt41.dergilev_a;
import java.util.Scanner;
public class PrivateHouse extends  House {
    @Override
    public void init(Scanner scanner) {
        super.init(scanner);
    }

    @Override
    public String toString() {
        return  "Частный дом цена постройки="+super.toString();
    }
}
