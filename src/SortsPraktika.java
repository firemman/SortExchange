import java.util.ArrayList;
import java.util.Collections;

public class SortsPraktika {
    private static void printFirstArray(ArrayList<Integer> arr) {
        for (int el: arr) {
            System.out.print(el + " ");
        }
        System.out.println();
    } // Функция вывода изначального массива
    public static void sortExchangeMin(ArrayList<Integer> oldArray) {
        ArrayList<Integer> arr = new ArrayList<>(oldArray); // Создаём копию массива и изменяем уже её
        System.out.print("\nСортировка массива вставками используя SearchMin (1-я строка - изначальный массив):\n");
        printFirstArray(arr);
        for (int i = 0; i < arr.size() - 1; i++) {  // Внешний цикл по всем элементам с первого по порядку (кроме последнего в массиве)
            int minArr = Integer.MAX_VALUE;
            int keyMin = 0;     // Индекс минимального числа в массиве

            for (int j = i; j < arr.size(); j++) {  // Внутренний цикл по всем элементам кроме уже пройденных внешним циклом (то есть цикл по неотсортированной части)
                if (arr.get(j) < minArr) {      // Находим минимальный элемент во внутреннем цикле
                    minArr = arr.get(j);
                    keyMin = j;
                }
            }
            Collections.swap(arr, arr.indexOf(arr.get(i)), arr.indexOf(arr.get(keyMin)));   // Меняем значение текущего элемента с минимальным
            for (int element: arr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void sortExchangeMax(ArrayList<Integer> oldArray) {
        ArrayList<Integer> arr = new ArrayList<>(oldArray); // Создаём копию массива и изменяем уже её
        System.out.print("\nСортировка массива вставками используя SearchMax (1-я строка - изначальный массив): \n");
        printFirstArray(arr);
        for (int i = arr.size() - 1; i > 0; i--) {  // Внешний цикл по всем элементам с последнего по порядку (кроме первого в массиве)
            int maxArr = arr.get(i);    // Задаём максимальное значение первым элементом цикла
            int keyMax = i;     // Индекс максимального числа в массиве

            for (int j = i; j >= 0; j--) {  // Внутренний цикл по всем элементам кроме уже пройденных внешним циклом (то есть цикл по неотсортированной части)
                if (arr.get(j) > maxArr) {  // Находим максимальный элемент во внутреннем цикле
                    maxArr = arr.get(j);
                    keyMax = j;
                }
            }
            Collections.swap(arr, arr.indexOf(arr.get(i)), arr.indexOf(arr.get(keyMax)));   // Меняем значение текущего элемента с максимальным
            for (int element: arr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
