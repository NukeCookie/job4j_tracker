package ru.job4j.bank;

import java.util.Objects;

/**
 * Данный класс описывает модель банковского счета
 * @author Mityaeva Anna
 * @version 1.0
 */
public class Account {
    /**
     * Хранение реквизитов пользователя осуществляется в поле requsite
     * Хранение значения баланса пользователя осуществляется в поле balance
     */
    private String requisite;
    private double balance;

    /**
     * Конструктор полей
     * @param requisite инициализация поля реквизит
     * @param balance инициализация поля баланс
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * @return возвращает данные поля реквизиты пользователя
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод присваивает значение полю реквизиты
     * @param requisite данные поля реквизиты пользователя
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * @return возвращает данные поля баланс пользователя
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Метод присваивает значение полю баланс
     * @param balance данные поля баланс пользователя
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     *Переопределение метода equals
     * Объекты сравниваются по полю requisite
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * Переопределение метода hasCode
     * Возвращается hashCode поля requisite
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
