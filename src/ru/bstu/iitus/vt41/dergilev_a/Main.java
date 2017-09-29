package ru.bstu.iitus.vt41.dergilev_a;
import java.util.Scanner;
public class Main {
    public static void bubbleSort(Construction[] arr){
    /*Внешний цикл каждый раз сокращает фрагмент массива,
      так как внутренний цикл каждый раз ставит в конец
      фрагмента максимальный элемент*/
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            if( arr[j].cost > arr[j+1].cost ){
                Construction tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество сооружений");

        int countConst = scanner.nextInt();
        Construction[] array = new Construction[countConst];
        int type;
        for (int i = 0; i < countConst; i++) {
            System.out.println("Выберите тип сооружения");
            System.out.println("1 - Отель");
            System.out.println("2 - Ресторан");
            System.out.println("3 - Многоквартирный дом");
            System.out.println("4 - Частный дом");
            type = scanner.nextInt();
            scanner.nextLine();
            switch (type) {
                case 1:
                    array[i] = new Hotel();
                    array[i].init(scanner);
                    break;
                case 2:
                    array[i] = new Restaurant();
                    array[i].init(scanner);
                    break;
                case 3:
                    array[i] = new ApartmentBuilding();
                    array[i].init(scanner);
                    break;
                default:
                    array[i] = new PrivateHouse();
                    array[i].init(scanner);
                    break;
            }
        }
        bubbleSort(array);
        for (int i=0; i<countConst; i++){
           System.out.println(array[i].toString());
        }
    }
}
