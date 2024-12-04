package repository;

import entity.TodoList;

public class TodoListRepoImpl implements TodoListRepo{
    public TodoList[] data = new TodoList[10];


    @Override
    public TodoList[] getAll() {
        return data;
    }

    @Override
    public void add(TodoList todoList) {

    }

    @Override
    public void remove(Integer number) {

    }
}
