package Model;

public class MyLinkedList<T> {
    private Node<T> head; // головной узел списка
    private Node<T> tail; // хвостовой узел списка
    private int size; // количество элементов списка

    // Конструктор
    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // Метод для вставки элемента в начало списка
    public void insertAtBeginning(T data) {
        Node<T> newNode = new Node<>(data); // создание нового узла
        if (head == null) { // если список пуст, новый узел становится как головой, так и хвостом списка
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head; // Если список не пуст, новый узел становится головой, а предыдущая голова становится следующим для новой головы
            head = newNode;
        }
        size++; // Увеличение размера списка на 1
    }

    // Метод для вставки элемента в конец списка
    public void insertAtEnd(T data) {
        Node<T> newNode = new Node<>(data);
        if (tail == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    // Метод для получения элемента по индексу
    public T get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index out of bounds");

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    // Метод для получения размера списка
    public int size() {
        return size;
    }

    // Вложенный класс для представления узла списка
    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}
