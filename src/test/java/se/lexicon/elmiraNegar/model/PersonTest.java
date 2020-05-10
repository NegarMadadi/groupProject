package se.lexicon.elmiraNegar.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    public static final int PERSON_ID = 123;
    public static final String FIRST_NAME = "Negar";
    public static final String LAST_NAME = "Madadi";
    private Person testObject;

    @Before
    public void setup() {
        testObject = new Person(

                PERSON_ID,
                FIRST_NAME,
                LAST_NAME
        );
    }


    @Test
    public void testObjects_succsessfully_created() {
        assertEquals(PERSON_ID, testObject.getPersonId());
        assertEquals(FIRST_NAME, testObject.getFirstName());
        assertEquals(LAST_NAME, testObject.getLastName());
    }


    @Test
    public void given_newFirstName_setName_should_update_firstName() {
        String newFirstName = "Elmira";
        testObject.setFirstName(newFirstName);

        assertEquals(newFirstName, testObject.getFirstName());
    }


    @Test
    public void given_newLastName_setName_should_update_LastName() {
        String newLastName = "Madadi2";
        testObject.setLastName(newLastName);

        assertEquals(newLastName, testObject.getLastName());
    }
}
