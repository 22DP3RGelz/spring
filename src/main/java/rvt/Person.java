package rvt;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    String name;
    Education education;

    public Person (String name, Education education){
        this.name = name;
        this.education = education;
    }

    public Education getEducation(String name){
        return education;
    }

    public String toString(Person person){
        return this.name + ", " + this.education;
    }

}
