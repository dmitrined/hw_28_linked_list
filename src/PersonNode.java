public class PersonNode {
    private Person value;
    private PersonNode prev;      // предыдущая нода
    private PersonNode next;      // следующая нода

    public PersonNode(Person value, PersonNode prev, PersonNode next) {
        this.value = value;
        this.prev = prev;
        this.next = next;
    }

    public Person getValue() {
        return value;
    }

    public PersonNode getPrev() {
        return prev;
    }

    public void setPrev(PersonNode prev) {
        this.prev = prev;
    }

    public PersonNode getNext() {
        return next;
    }

    public void setNext(PersonNode next) {
        this.next = next;
    }
}
