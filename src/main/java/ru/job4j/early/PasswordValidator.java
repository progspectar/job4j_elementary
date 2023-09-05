package ru.job4j.early;

public class PasswordValidator {
    private static final String[] FORBIDDEN = {"qwerty", "12345", "password", "admin", "user"};

    public enum Status {
        VALID("Valid"),
        NULL("Password can't be null"),
        LENGTH_INVALID("Password should be length [8, 32]"),
        NOT_HAS_UPCASE("Password should contain at least one uppercase letter"),
        NOT_HAS_LOWCASE("Password should contain at least one lowercase letter"),
        NOT_HAS_DIGIT("Password should contain at least one figure"),
        NOT_HAS_SPECIAL("Password should contain at least one special symbol"),
        IS_CONTAINS_FORBIDDEN("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");

        private final String text;

        Status(final String text) {
            this.text = text;
        }

        public String toString() {
            return text;
        }
    }

    private static Status checkLengthOrNull(String password) {
        if (password == null) {
            return Status.NULL;
        }
        if (password.length() < 8 || password.length() > 32) {
            return Status.LENGTH_INVALID;
        }
        return Status.VALID;
    }

    private static Status checkConditions(String password) {
        boolean hasUpCase = false;
        boolean hasLowCase = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        for (char symbol : password.toCharArray()) {
            if (Character.isUpperCase(symbol)) {
                hasUpCase = true;
            }
            if (Character.isLowerCase(symbol)) {
                hasLowCase = true;
            }
            if (Character.isDigit(symbol)) {
                hasDigit = true;
            }
            if (!Character.isLetterOrDigit(symbol)) {
                hasSpecial = true;
            }
        }
        if (!hasUpCase) {
            return Status.NOT_HAS_UPCASE;
        }
        if (!hasLowCase) {
            return Status.NOT_HAS_LOWCASE;
        }
        if (!hasDigit) {
            return Status.NOT_HAS_DIGIT;
        }
        if (!hasSpecial) {
            return Status.NOT_HAS_SPECIAL;
        }
        return Status.VALID;
    }

    private static Status checkStatus(String password) {
        Status status = checkLengthOrNull(password);
        if (status != Status.VALID) {
            return status;
        }
        status = checkConditions(password);
        if (status != Status.VALID) {
            return status;
        }
        return isContainsForbidden(password);
    }

    private static Status isContainsForbidden(String password) {
        password = password.toLowerCase();
        for (String str : FORBIDDEN) {
            if (password.contains(str)) {
                return Status.IS_CONTAINS_FORBIDDEN;
            }
        }
        return Status.VALID;
    }

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
        Status status = checkStatus(password);
        if (status != Status.VALID) {
            throw new IllegalArgumentException(status.toString());
        }
        return password;
    }
}