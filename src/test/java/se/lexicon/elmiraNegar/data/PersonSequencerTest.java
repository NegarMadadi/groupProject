package se.lexicon.elmiraNegar.data;


import org.junit.Before;
import org.junit.Test;
import se.lexicon.elmiraNegar.data.PersonSequencer;

import static org.junit.Assert.assertEquals;


public class PersonSequencerTest {

    private PersonSequencer testObject;

    @Before
    public void previous() {
       PersonSequencer.reset();
    }


    @Test
    public void personId (){

        int id = PersonSequencer.nextPersonId();
       assertEquals(1, id);
    }

}
