import java.util.Arrays;

public class MyPersonArrayList implements MyList {
    private String[] array = new String[2];
    private int size = 0;

    @Override
    public void add(Person person) {
        if (size >= array.length) {

            enlarge();
        }
        array[size] = String.valueOf(person);
        size++;
    }

    private void enlarge() {
        String[] newArray = Arrays.copyOf(array, array.length * 2);
        array = newArray;
    }

    @Override
    public String get(int index) {
        if (index<0 || index>size-1){
            return null;
        }
        return array[index];
    }

    @Override
    public int size() {
        return size;
    }
    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++) {
            result += array[i].toString() + System.lineSeparator();
        }
        return result;
    }

}
