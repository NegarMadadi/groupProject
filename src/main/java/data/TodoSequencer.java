package data;

public class TodoSequencer {
    private static int toDoPersonId;

    public static int nextToDoPersonId(){
        toDoPersonId ++;

        return toDoPersonId;
    }

    public static void reset(){
        toDoPersonId = 0;
    }

}
