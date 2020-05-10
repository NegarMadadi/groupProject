package se.lexicon.elmiraNegar.model;

public class Todo {
    private final int todoId;
    private String description;
    private boolean done;
    private Person assignee;

    public Todo(int todoId, String description) {
        this.todoId = todoId;
        this.description = description;
    }

    public int getTodoId() {
        return todoId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
