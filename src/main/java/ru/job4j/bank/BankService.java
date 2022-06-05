package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает банковский сервис
 * Добавление пользователя, счета, поиск пользователя по паспорту,
 * по реквизитам, перевод денег с одного счета на другой
 */
public class BankService {
    /**
     * Поле содержит всех пользователей системы с привязанными к ним счетами
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Этот метод проверяет, есть ли пользователь в системе,
     * и, если такого еще нет - добавляет пользователя в систему
     * @param user пользователь
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод проверяет, есть ли пользователь в системе,
     * существует ли такой аккаунт у данного пользователя
     * и добавляет новый счет к пользователю, если такого еще нет
     * @param passport паспорт пользователя
     * @param account счет пользователя
     */
    public void addAccount(String passport, Account account) {
        User user = this.findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод выполняет поиск пользователя по полю паспорт
     * @param passport паспорт пользователя
     * @return возвращает найденного пользователя
     */
    public User findByPassport(String passport) {
        for (User curUser : users.keySet()) {
            if (curUser.getPassport().equals(passport)) {
                return curUser;
            }
        }
        return null;
    }

    /**
     * Метод ищет счет пользователя по реквизитам
     * @param passport паспорт пользователя
     * @param requisite реквизиты
     * @return счет пользователя
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = this.findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            for (Account curAccount : accounts) {
                if (curAccount.getRequisite().equals(requisite)) {
                    return curAccount;
                }
            }
        }
        return null;
    }

    /**
     *Метод выполняет перевод средств со счета отправителя на счет получателя
     * Если счёт не найден или не хватает - метод возвращает false
     * @param srcPassport паспорт отправителя
     * @param srcRequisite реквизиты отправителя
     * @param destPassport паспорт получателя
     * @param destRequisite реквизиты получателя
     * @param amount сумма к перечислению
     * @return false при неуспехе перевода или true при успешном переводе средств
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = this.findByRequisite(srcPassport, srcRequisite);
        Account destAccount = this.findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null
                && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
