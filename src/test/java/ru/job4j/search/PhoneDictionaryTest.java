package ru.job4j.search;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.search.Person;
import ru.job4j.search.PhoneDictionary;

import java.util.ArrayList;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Petr");
        Assert.assertThat(persons.get(0).getSurname(), Is.is("Arsentev"));
    }

    @Test
    public void whenNothingFound() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
        new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Anna");
        Assert.assertTrue(persons.isEmpty());
    }
}