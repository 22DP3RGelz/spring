package rvt;

import java.util.List;

public class Employees {
    List<Person> employees;

    public void add(Person personToAdd){
        employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd){
        employees.addAll(peopleToAdd);
    }

    public void print(){
        for (Person person : employees){
            person.toString(person);
        }
    }

}
