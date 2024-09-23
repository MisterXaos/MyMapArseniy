package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Student {
    public static String name;
    public static String studentId;
    private static Map<String, Student> students = new HashMap<>();

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    static void addStudent(String id, Student student){
        students.put(id, student);
    }

    static String gatfull(){
        return " Имя студента " + name + " ,id студента " + studentId;
    }

    static String getStudent(String studentId){
        return students.get(studentId).gatfull();
    }
}

