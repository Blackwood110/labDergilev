package ru.bstu.iitus.vt41.dergilev_a;
import java.util.Scanner;

public abstract class Construction {
    protected int cost;
    public abstract void init(Scanner scanner); // считывание параметров с консоли
    public abstract int getConstructionCost(); // возвращает стоимость возведения сооружения
}
