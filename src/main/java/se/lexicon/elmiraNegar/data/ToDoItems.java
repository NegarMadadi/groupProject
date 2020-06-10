package se.lexicon.elmiraNegar.data;

import se.lexicon.elmiraNegar.model.Person;
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

    //10.a------Returns array with objects that has matching one status.
    public Todo[] findByDoneStatus(boolean doneStatus) {
        Todo[] status = new Todo[0];
        int index = 0;
        for (int i = 0; i < todoList.length; i++) {
            if (todoList[i].getDone() == doneStatus) {
                status = Arrays.copyOf(status, status.length + 1);
                status[index] = todoList[i];
                index++;
            }
        }
        return status;
    }

    //10.b------Returns array with objects that has an assignee with a personId matching.
    public Todo[] findByAssignee(int personId) {
        Todo[] assignees = new Todo[0];     //assignees is a person
        int index = 0;
        for (int i = 0; i < todoList.length; i++) {
            if (todoList[i].getAssignee() != null) {
                if (todoList[i].getAssignee().getPersonId() == personId) {
                    assignees = Arrays.copyOf(assignees, assignees.length + 1);
                    assignees[index] = todoList[i];
                    index++;
                }
            }
        }
        return assignees;
    }

    //10.c------Return array with objects that has sent in Person.
    public Todo[] findByAssignee(Person assignee) {
        Todo[] assigneeFined = new Todo[0];
        int index = 0;
        for (int i = 0; i < todoList.length; i++) {
            if (todoList[i].getAssignee() == assignee) {
                assigneeFined = Arrays.copyOf(assigneeFined, assigneeFined.length + 1);
                assigneeFined[index] = todoList[i];
                index++;
            }
        }
        return assigneeFined;
    }

        //10.d------Return an array of objects that does not have an assignee set
        public Todo[] findUnassignedTodoItems () {
            Todo[] unassignedItem = new Todo[0];
            int index1 = 0;
            for (int i = 0; i < todoList.length; i++) {
                if (todoList[i].getAssignee() == null) {
                    unassignedItem = Arrays.copyOf(unassignedItem, unassignedItem.length + 1);
                    unassignedItem[index1] = todoList[i];
                    index1++;
                }
            }
            return unassignedItem;
        }


        //11.a------Functionality to remove objects from array.(not nulling)
        //First: you need to find the correct array index of object
        //Second: You need to rebuild array by executing the object on found index
    public void removeObjectFromTodoArray(int todoId){
        int index = 0;
        for(int i=0; i < todoList.length; i++){
            if(todoList[i].getTodoId() == todoId) {
                todoList = Arrays.copyOf(todoList, todoList.length - 1);
            }else if(todoList[index] != todoList[i]){
                index++;
            }
            }
        }
    }


