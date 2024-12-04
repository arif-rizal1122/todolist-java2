package testing;

import entity.TodoList;
import repository.TodoListRepo;
import repository.TodoListRepoImpl;
import service.TodoListServiceImpl;
import service.TodolistService;

public class TodoListServiceTest {
    public static void main(String[] args) {

     testShowTodoList();

    }

    public static void testShowTodoList(){
        TodoListRepoImpl todoListRepo = new TodoListRepoImpl();
        todoListRepo.data[0] = new TodoList("nomor 1");
        todoListRepo.data[1] = new TodoList("nomor 2");
        todoListRepo.data[2] = new TodoList("nomor 3");
        todoListRepo.data[3] = new TodoList("nomor 4");

        TodolistService todolistService = new TodoListServiceImpl(todoListRepo);
        todolistService.showTodoList();
    }

}
