package Presenter;

import Model.MyLinkedList;

public class MyLinkedListPresenter<T> {
    private MyLinkedList<T> model;

    public MyLinkedListPresenter(MyLinkedList<T> model) {
        this.model = model;
    }

    public void insertAtBeginning(T data) {
        model.insertAtBeginning(data);
    }

    public void insertAtEnd(T data) {
        model.insertAtEnd(data);
    }

    public T get(int index) {
        return model.get(index);
    }
}
