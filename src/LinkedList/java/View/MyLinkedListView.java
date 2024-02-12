package View;

import Model.MyLinkedList;

public class MyLinkedListView {
    public static void main(String[] args) {
        MyLinkedList<Integer> myList = new MyLinkedList<>();
        myList.insertAtBeginning(1);
        myList.insertAtEnd(2);
        myList.insertAtEnd(3);
        myList.insertAtBeginning(0);

        System.out.println("Размер списка: " + myList.size());

        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Количество элементов по индексу " + i + ": " + myList.get(i));
        }
    }
}
