package ru.job4j.checkstyle;

public class Broken {
    public static final String NEW_VALUE = "";
    private int sizeOfEmpty = 10;
    private String surname;
    private String name;

    public Broken() {
    }

    public void echo() {
    }

    /* test single-line comment */
    // test single-line comment
    public void media(Object obj) {
        if (obj != null) { /* test single-line comment */
            System.out.println(obj); //  test single-line comment
        }
    }

   public void method(int a, int b, int c, int d, int e, int f, int g) {

    }
}