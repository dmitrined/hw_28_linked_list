public class MyPersonLinkedList implements MyList{
    private Node head = null; // первая нода в списке
    private Node tail = null; // последняя нода в списке
    private int size = 0;

    @Override
    public void add(Person person) {
        Node node = new Node(person, tail, null);
        size++;
        if (head == null) {         // листа еще нет, создаем первую ноду
            head = node;
            tail = node;
            return;
        }
        node.getPrev().setNext(node);
        tail = node;
    }

    @Override
    public String get(int index) {
        if (index < 0 || index > size - 1) {
            return null;
        }
        int count = 0;
        Node currentNode = head;
        while (count < index) {
            currentNode = currentNode.getNext();
            count++;
        }
        return String.valueOf(currentNode.getValue());
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        String result = "";
        Node current = head;
        while (current != null) {
            result += current.getValue().toString() + System.lineSeparator();
            current = current.getNext();
        }
        return result;
    }
}
