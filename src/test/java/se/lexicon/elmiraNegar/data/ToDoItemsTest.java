package se.lexicon.elmiraNegar.data;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import se.lexicon.elmiraNegar.model.Person;
import se.lexicon.elmiraNegar.model.Todo;

public class ToDoItemsTest {
    ToDoItems toDoItems;
    People people;
    private Todo todo;

    @Before
    public void setUp() throws Exception {
        toDoItems = new ToDoItems();
        TodoSequencer.reset();
        toDoItems.clear();
        todo = toDoItems.addTodoList("description");           //_________________???????
    }

    @Test
    public void sizeTest() {
        int expected = 1;
        Assert.assertEquals(expected, toDoItems.size());
    }

    @Test
    public void find_all_todo_test() {
        int expected = 1;
        Assert.assertEquals(expected, toDoItems.findAllTodo().length);
    }

    @Test
    public void find_by_Id_todo_test() {
    Todo expected = todo;
    Todo actual = toDoItems.findByIdTodo(1);

    Assert.assertEquals(expected, actual);
    }

    @Test
    public void add_todo_list_test() {
        Todo expected = new Todo(2, "description");
        Todo actual = toDoItems.addTodoList("description");

        Assert.assertEquals(expected.getTodoId(), actual.getTodoId());
        Assert.assertEquals(expected.getTodoId(), actual.getTodoId());
        Assert.assertEquals(expected.getTodoId(), actual.getTodoId());
    }

    @Test
    public void Clear_object_from_todo_array() {
        int expected = 0;
        toDoItems.clear();
        Assert.assertEquals(expected, toDoItems.size());
    }

    @Test
    public void size_check() {
        int expected = 1;

        Assert.assertEquals(expected, toDoItems.findAllTodo().length);
    }

    @Test
    public void find_by_Id_test() {
        Todo expected = todo;
        Todo actual = todo;
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void find_by_Id_todo_non_existing_Id() {
        Assert.assertNull(toDoItems.findByIdTodo(-1));
    }


}
