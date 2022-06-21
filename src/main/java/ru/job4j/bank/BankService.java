package ru.job4j.bank;

import java.util.*;

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
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> accounts = users.get(user.get());
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
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(user1 -> user1.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод ищет счет пользователя по реквизитам
     * @param passport паспорт пользователя
     * @param requisite реквизиты
     * @return счет пользователя
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
            return user.flatMap(value -> users.get(value)
                    .stream()
                    .filter(account -> account.getRequisite().equals(requisite))
                    .findFirst());
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
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount.isPresent() && destAccount.isPresent()
                && srcAccount.get().getBalance() >= amount) {
            srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
            destAccount.get().setBalance(destAccount.get().getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
