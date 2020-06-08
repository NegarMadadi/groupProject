package se.lexicon.elmiraNegar.data;

import se.lexicon.elmiraNegar.model.Todo;

import java.util.Arrays;

public class ToDoItems {
    //a.array is empty not null
    private static Todo[] todoList = new Todo[0];

    //b.returns length of array
    public int size() {
        return todoList.length;
    }

    public Todo[] findAllTodo() {
        return todoList;
    }

    public Todo findById(int todoId) {
        int index = -1;
        for (int i = 0; i < size(); i++) {
            if (todoList[i].getTodoId() == todoId) {
                index = i;
            }
        }
        if (index == -1) {
            return null;
        }
        return todoList[index];
    }


    public void clear(){
        todoList = new Todo[0];
    }



    //___10a_________________________________________________

}
