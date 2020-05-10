package se.lexicon.elmiraNegar.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TodoTest {

    public static final String DESCRIPTION = "Study";
    public static final int TODO_ID = 3;
    private Todo testObject;


    @Before
    public void setup() {
        testObject = new Todo(
                TODO_ID,
                DESCRIPTION
        );
    }


    @Test
    public void testObjects_succsessfully_created() {
        assertEquals(TODO_ID, testObject.getTodoId());
        assertEquals(DESCRIPTION, testObject.getDescription());
    }


    @Test
    public void given_newDescription_setName_should_update_Description() {
        String newDescription = "Sleeping";
        testObject.setDescription(newDescription);
        assertEquals(newDescription, testObject.getDescription());
    }
}
