package se.lexicon.elmiraNegar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import se.lexicon.elmiraNegar.data.People;
import se.lexicon.elmiraNegar.data.PersonSequencer;
import se.lexicon.elmiraNegar.model.Person;

public class PeopleTest {

   private People people;
   private Person person;

    @Before
    public void setUp() throws Exception {
        people = new People();
        PersonSequencer.reset();
        people.clear();
        person = people.addNewMemberToPersonList("Negar", "Madadi");
    }


    @Test
    public void add_new_member_to_person_list() {
        Person expected = new Person(2, "Elmira", "Madadi" );
        Person actual =  people.addNewMemberToPersonList("Elmira", "Madadi");


      Assert.assertEquals(expected.getPersonId(), actual.getPersonId());
      Assert.assertEquals(expected.getFirstName(), actual.getFirstName());
      Assert.assertEquals(expected.getLastName(), actual.getLastName());
    }

    @Test
    public void Clear_object_from_person_array() {
        int expected = 0;
         people.clear();
         Assert.assertEquals(expected, people.size());
    }

    @Test
    public void size_check() {
        int expected = 1;

        Assert.assertEquals(expected, people.findAll().length);
    }

    @Test
    public void find_by_Id_test() {
        Person expected = person;
        Person actual = people.findById(1);
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void find_by_Id_non_existing_Id() {
        Assert.assertNull(  people.findById(-1));
    }

    @Test
    public void find_all_test() {
        int expected = 1;
        int actual = people.findAll().length;

        Assert.assertEquals(expected, actual);
    }
}
