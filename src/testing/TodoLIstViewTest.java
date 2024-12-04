package testing;

import repository.TodoListRepo;
import repository.TodoListRepoImpl;
import service.TodoListServiceImpl;
import service.TodolistService;
import view.TodoListView;

public class TodoLIstViewTest {
    public static void main(String[] args) {

       testShowTodoList();
    }

    public static void testShowTodoList(){
        TodoListRepo todoListRepo = new TodoListRepoImpl();
        TodolistService todolistService = new TodoListServiceImpl(todoListRepo);
        TodoListView todoListView = new TodoListView(todolistService);

        todolistService.addTodoList("amel 1");
        todolistService.addTodoList("amel 2");
        todolistService.addTodoList("amel 3");
        todolistService.addTodoList("amel 4");
        todolistService.addTodoList("amel 5");
        todoListView.showTodoList();

    }

}
