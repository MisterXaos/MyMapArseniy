package org.example;

public class Main {
    public static void main(String[] args) {

        //Students
        Student.addStudent("1",new Student("AAAA","1id"));
        System.out.println(Student.getStudent("1id"));

        //SubjectGrades
        SubjectGrades Inform = new SubjectGrades("Информатика");

        Inform.addGrade("AAA", 5);
        Inform.addGrade("FFF", 4);
        Inform.addGrade("Арсен", 5);
        Inform.addGrade("CCC", 3);

        System.out.println("Средняя оценка по классу " + Inform.calculateAverage());

        //AddressBook
        AddressBook addressBook = new AddressBook();
        addressBook.addContact("Петя", "+8800553535");
        addressBook.addContact("Саня", "+9876543210");
        addressBook.addContact("ААААААААА", "+8346867364");
        System.out.println("Номер " + addressBook.getPhone("ААААААААА"));
        addressBook.removeContact("Саня");

        //WordFrequency
    }
}