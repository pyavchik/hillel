package OOP.HillelHomeWorkLesson7;

/**
 * Created by oleksandrpiavchik on 04.03.16.
 *
 */
public class ImprovedArray {
    private String [] stringsArray = new String[10];
    int count;
    String prettyString = "";

    public void add(String value){
        // добавляет эелементы друг за другом
        if (count < stringsArray.length){
            stringsArray[count] = value;
            count++;
        } else if (count == stringsArray.length){
            String[] tempStringArray = new String[count * 2];
            System.arraycopy(stringsArray, 0, tempStringArray, 0, stringsArray.length);
            stringsArray = tempStringArray;
            stringsArray[count] = value;
            count++;
        }
    }

    public String get(int index){
        //возвращает элемент, находящийся по указанному индексу.
        return stringsArray[index];
    }

    public int size(){
        //количество заполненных элементов (которые передали в метод add(String)) (не размер массива!)
        return count;
    }

    public boolean equals(ImprovedArray other){
        //условие равенства:
        //одинаковый размер
        //первый элемент одного равен первому элементу другого, второй - второму и т.д.
        if (this.count == other.count) {
            return true;
        }else {
            return false;
        }
    }

    public String toString(){
        // - возвращает красиво оформленную строку (без null)

        for (int i = 0; i < count; i++) {
            prettyString = prettyString + stringsArray[i] + " ";
        }

        return prettyString;
    }
}
