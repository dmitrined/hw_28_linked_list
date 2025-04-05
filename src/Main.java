public class Main {
    public static void main(String[] args) {

//        MyList list = new MyPersonLinkedList();
       MyList list = new MyPersonArrayList();
        list.add(new Person("Alice",25));
        list.add(new Person("Jessi",30));
        list.add(new Person("Make",35));
        list.add(new Person("Bob",27));

//        for (int i = 0; i < list.size() ; i++) {
//            System.out.println(list.get(i));
//        }

       System.out.println(list);
    }

}