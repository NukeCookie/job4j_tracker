package ru.job4j.search;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        var persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname(), Is.is("Arsentev"));
    }

    @Test
    public void whenNothingFound() {
        var phones = new PhoneDictionary();
        phones.add(
        new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        var persons = phones.find("Anna");
        Assert.assertTrue(persons.isEmpty());
    }
}