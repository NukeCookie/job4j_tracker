package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель пользователя банка
 */
public class User {
    /**
     * Поля паспорт и имя пользователя
     */
    private String passport;
    private String username;

    /**
     * конструктор, инициализирующий поля паспорт и имя пользователя
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * @return возвращает данные поля паспорт
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод устанавливает значение поля паспорт
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * @return возвращает значение поля имя пользователя
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод устанавливает имя пользователя
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *Переопределение метода equals
     * Объекты сравнимаются по полю passport
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Переопределение метода hasCode
     * Возвращается hashCode поля passport
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
