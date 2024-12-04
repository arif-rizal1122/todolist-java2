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
        resizeIsFull();
        // tmabhakan posisi ke data array nya null
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null){
                data[i] = todoList;
                break;
            }
        }

    }

    public void resizeIsFull(){
        // jika penuh, kita resize ukuran array 2x lipat
        if (isFull()){
            var temp = data; // array lama
            data = new TodoList[data.length * 2]; // array baru
            for (int i = 0; i < temp.length; i++) {
                if (data[i] == temp[1]){
                    break;
                }
            }
        }
    }
    public boolean isFull(){
        boolean isFull = true;
        // cek apakah model penuh
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null){
                // model masih ada yg kosong
                isFull = false;
                break;
            }
        }
        return isFull;
    }

    @Override
    public boolean remove(Integer number) {
        if ((number - 1) >= data.length){
            return false;
        } else if (data[number - 1] == null){
            return false;
        } else {
            for (int i = number - 1; i < data.length; i++) {
                if (i == (data.length -1)){
                    data[i] = null;
                } else {
                    data[i] = data[i + 1];
                }

            }
            return true;
        }
    }
}
