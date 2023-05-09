
//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class task_02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));


        int min = Collections.min(list);


        int max = Collections.max(list);


        double average = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + average);
    }
}
