import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("Введите количество элементов вашего массива: ");
        int size = console.nextInt();
        System.out.print("Введите ваш массив в одну строку разделяя элементы одним пробелом:\narr = ");
        for (int i = 0; i < size; i++) {
            arr.add(console.nextInt());
        }

        SortsPraktika.sortExchangeMin(arr);
        SortsPraktika.sortExchangeMax(arr);
    }
}