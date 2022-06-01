package ru.job4j.collection;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.collection.Citizen;
import ru.job4j.collection.PassportOffice;

public class PassportOfficeTest {

    @Test
    public void add() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        Assert.assertThat(office.get(citizen.getPassport()), Is.is(citizen));
    }

    @Test
    public void whenDuplicatedPassport() {
        PassportOffice office = new PassportOffice();
        Citizen citizen1 = new Citizen("2f44a", "Petr Arsentev");
        Citizen citizen2 = new Citizen("2f44a", "Anna Mityaeva");
        office.add(citizen1);
        Assert.assertFalse(office.add(citizen2));
    }
}