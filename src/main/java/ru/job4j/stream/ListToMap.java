package ru.job4j.stream;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ListToMap {

    public static Map<String, Student> convert(List<Student> list) {
        return new LinkedHashMap<>();
    }
}