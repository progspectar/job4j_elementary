package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> predn = f -> f.getName().equals(key);
        Predicate<Person> preds = f -> f.getSurname().equals(key);
        Predicate<Person> predp = f -> f.getPhone().equals(key);
        Predicate<Person> preda = f -> f.getAddress().equals(key);
        Predicate<Person> combine = predn.or(preds).or(predp).or(preda);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}