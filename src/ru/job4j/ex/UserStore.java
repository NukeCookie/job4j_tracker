package ru.job4j.ex;

import java.util.Objects;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (User user : users) {
            if (login.equals(user.getUsername())) {
                rsl = user;
                break;
            }
        }
        if (rsl == null) {
            throw new UserNotFoundException("User is not found");
        }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.isValid() && user.getUsername().length() >= 3) {
            return true;
        } else {
            throw new UserInvalidException("User is not valid");
        }
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Anna Mityaeva", true)
        };
        try {
            User user = findUser(users, "Anna Mityaeva");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserNotFoundException uie) {
            uie.printStackTrace();
        }
    }
}