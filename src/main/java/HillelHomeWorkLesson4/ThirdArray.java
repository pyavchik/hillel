package HillelHomeWorkLesson4;


import org.apache.commons.lang.ArrayUtils;

import java.util.Arrays;

/**
 * Created by test on 22.02.16.
 * 5. Есть 2 массива упорядоченных по возрастанию. Получите 3й массив, который объединит все эти элементы, но также в возрастающем порядке.

 Пример ввода:
 a = {1, 3, 5}
 b = {2, 4, 8, 9, 12}
 Результат:
 c = {1, 2, 3, 4, 5, 8, 9, 12}

 */
public class ThirdArray {
    public static void main(String[] args) {
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 8, 9, 12};

        int[] c = ArrayUtils.addAll(a, b);

        Arrays.sort(c);

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }

    }

}