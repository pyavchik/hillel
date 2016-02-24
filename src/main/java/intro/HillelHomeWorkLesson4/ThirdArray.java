package intro.HillelHomeWorkLesson4;


import org.apache.commons.lang.ArrayUtils;

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

        for (int i = 0; i < c.length; i++) {
            int min_index = i;
            for (int j = i + 1; j < c.length; j++) {
                if (c[j] < c[min_index]) {
                    min_index = j;
                }
            }
            int buf = c[i];
            c[i] = c[min_index];
            c[min_index] = buf;
        }

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }

    }

}