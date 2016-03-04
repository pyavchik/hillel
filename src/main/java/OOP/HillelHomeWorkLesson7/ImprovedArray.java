package OOP.HillelHomeWorkLesson7;

/**
 * Created by oleksandrpiavchik on 04.03.16.
 *
 */
public class ImprovedArray {
    private String [] strings = new String[10];
    int count;
    String prettyString = "";

    public void add(String value){
        // добавляет эелементы друг за другом
        if ((strings[count] == null) && (count <= strings.length)){
            strings[count] = value;
            count++;
        }
    }

    public String get(int index){
        //возвращает элемент, находящийся по указанному индексу.
        return strings[index];
    }

    public int size(){
        //количество заполненных элементов (которые передали в метод add(String)) (не размер массива!)
        return count;
    }

    public boolean equals(ImprovedArray other){
        //условие равенства:
        //одинаковый размер
        //первый элемент одного равен первому элементу другого, второй - второму и т.д.
        return true;
    }

    public String toString(){
        // - возвращает красиво оформленную строку (без null)

        for (int i = 0; i < count; i++) {
            prettyString = prettyString + strings[i] + " ";
        }

        return prettyString;
    }
}
