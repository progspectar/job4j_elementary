package ru.job4j.early;

public class PasswordValidator {
    private static final String[] FORBIDDEN = {"qwerty", "12345", "password", "admin", "user"};

    /**
     * Метод проверят пароль по правилам:
     * 1. Если password null, то выбросить исключение "Password can't be null";
     * 2. Длина пароля находится в диапазоне [8, 32],
     * если нет то "Password should be length [8, 32]";
     * 3. Пароль содержит хотя бы один символ в верхнем регистре,
     * если нет то "Password should contain at least one uppercase letter");
     * 4. Пароль содержит хотя бы один символ в нижнем регистре,
     * если нет то "Password should contain at least one lowercase letter";
     * 5. Пароль содержит хотя бы одну цифру,
     * если нет то"Password should contain at least one figure");
     * 6. Пароль содержит хотя бы один спец. символ (не цифра и не буква),
     * если нет то "Password should contain at least one special symbol");
     * 7. Пароль не содержит подстрок без учета регистра: qwerty, 12345, password, admin, user.
     * Без учета регистра, значит что, например, ни qwerty ни QWERTY ни qwErty и т.п.
     * если да, то "Password shouldn't contain substrings: qwerty, 12345, password, admin, user".
     *
     * @param password Пароль
     * @return Вернет пароль или выбросит исключение.
     */

    public static String validate(String password) {
        return password;
    }
}