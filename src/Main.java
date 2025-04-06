public class Main {
    public static void main(String[] args) {

//        MyList list = new MyPersonLinkedList();
        MyList list = new MyPersonArrayList();
        list.add(new Person("Alice", 25));
        list.add(new Person("Jessi", 30));
        list.add(new Person("Make", 35));
        list.add(new Person("Bob", 27));

        //выводим весь список в цикле
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Используем метод size() для получения размера списка
        System.out.println("Размер списка: " + list.size());

        // Используем метод get() для получения элементов по индексу
        System.out.println("Элемент по индексу 0: " + list.get(0));

        //выводим весь список, используя toString()
        System.out.println(list);
    }

}