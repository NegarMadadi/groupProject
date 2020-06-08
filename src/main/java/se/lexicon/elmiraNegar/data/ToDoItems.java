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

    public Todo findByIdTodo(int todoId) {
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

    public Todo addTodoList(String description) {
        Todo[] newTodo = Arrays.copyOf(todoList, todoList.length + 1);
        Todo task = new Todo(TodoSequencer.nextToDoPersonId(), description);
        newTodo[newTodo.length - 1] = task;
        todoList = newTodo;
        return task;
    }

    public void clear() {
        todoList = new Todo[0];
    }
}
