package se.lexicon.elmiraNegar.data;

import se.lexicon.elmiraNegar.model.Person;

import java.util.Arrays;

public class People {
    //a.array is empty not null
    private static Person[] person = new Person[0];

    //b.returns length of array
    public int size(){
        return this.person.length;
    }

    //c.return person array
    public Person[] findAll(){
        return this.person;
    }

    //d.this method return the person that has matching personId as passed in parameters
    //1.Iterate through the person Array
    //2.Find the person with specified Id
    //3.return the person with specified Id
    //if not found return null
    public Person findById(int personId){
        int index = -1;
        for(int i = 0; i < size(); i++){
            if(this.person[i].getPersonId() == personId){
                index = i;
            }
        }
        if(index == -1){
            return null;
        }
        return this.person[index];

    }

    //e.adding the new member to the person list. We only give the first and last name. It calls the Id.
   public Person addNewMemberToPersonList(String firstName, String lastName){

        // 1. Create a new person, te one to add into the array later on.
        Person newPerson = new Person(PersonSequencer.nextPersonId(), firstName, lastName);

       //2.create the copy of personArray with the length of personArray.length
        Person[] newMember = Arrays.copyOf(person, person.length +1);  //+1 add new member to array

       //3.create an offset with the value of personArray.length    //offset only an integer value(end)
        int offset = person.length;                                 //offset is newMember.length-1

       //4.iterate and add to the newly created array
        for(int i = offset; i < newMember.length; i++ ){
            newMember[i] = newPerson;
        }

       //5.set the original personArray to the new array
        person = newMember;

       //6.return the newly created person(not the array)
        return newPerson;
    }

    //f. Clear all Person objects from the Person Array
    public void clear(){
        person = new Person[0];
    }
}
