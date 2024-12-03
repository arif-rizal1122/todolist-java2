package repository;

import entity.TodoList;

public interface TodoListRepo {
   TodoList[] getAll();
   void add(TodoList todoList);
   void remove(Integer number);

}