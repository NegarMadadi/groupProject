package data;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TodoSequencerTest {
        private PersonSequencer testObject;

        @Before
        public void previous() {
            TodoSequencer.reset();
        }


        @Test
        public void personId() {

            int id = TodoSequencer.nextToDoPersonId();
            assertEquals(1, id);
        }
    }
