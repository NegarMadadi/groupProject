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

    //10.a--------
    @Test
    public void find_By_Done_Status_test(){

      todo.setDone(true);
      Todo object = toDoItems.addTodoList("write a list");
      object.setDone(true);

        Todo[] expected = new Todo[2];
        expected[0] = todo;
        expected[1] = object;
        Todo[] temp = toDoItems.findByDoneStatus(true);
        Assert.assertArrayEquals(expected, temp);
    }
    //10.b-------------------
    @Test
    public void find_By_Assignee_test(){ //searching person by using the id of person

        Person person01 = new Person(PersonSequencer.nextPersonId(), "Negar", "Madadi");

        Todo[] expected = new Todo[1];
        expected[0] = todo;

        todo.setAssignee(person01);
        int personId = person01.getPersonId();

        Assert.assertArrayEquals(expected,toDoItems.findByAssignee(personId));

    }


    //10.c---------------   //searching person by using the a person(entire person()id, name, familyName)
    @Test
    public void find_By_Assignee_Person_test(){
        Person person = new Person(PersonSequencer.nextPersonId(), "Negar", "Madadi");
        todo.setAssignee(person);

        Todo[] expected = new Todo[1];
        expected[0] = todo;

        Assert.assertArrayEquals(expected, toDoItems.findByAssignee(person));

    }

    //10.d----------------
    @Test
    public void find_Unassigned_TodoItems(){  //no person assigned to it
        Todo[] expected = new Todo[1];
        expected[0] = todo;

        Assert.assertArrayEquals(expected, toDoItems.findUnassignedTodoItems());
    }

    //11.a-------
    @Test
    public void remove_object_from_todo_array() {
        int expected = 0;
        toDoItems.removeObjectFromTodoArray(1);

        Assert.assertEquals(expected, toDoItems.size());
        Assert.assertNull(toDoItems.findByIdTodo(2));
    }
}
