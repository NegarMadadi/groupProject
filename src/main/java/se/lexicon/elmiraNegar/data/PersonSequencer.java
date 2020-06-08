package se.lexicon.elmiraNegar.data;

public class PersonSequencer {
    private  static int personId = 0;

   public static int nextPersonId(){
       personId ++;
       return personId;
   }

   public static void reset(){ personId = 0;
   }
}
