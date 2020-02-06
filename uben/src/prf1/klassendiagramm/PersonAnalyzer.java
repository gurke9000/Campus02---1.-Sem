package prf1.klassendiagramm;

import java.util.ArrayList;

public abstract class PersonAnalyzer {

    protected ArrayList<Person> persons = new ArrayList<>();

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public abstract void analyze();
}
