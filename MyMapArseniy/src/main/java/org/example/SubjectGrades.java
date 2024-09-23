package org.example;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.HashMap;
import java.util.Map;

public class SubjectGrades {

    public String SubjectGrades;
    public static Map<String, Integer> grades;

    public SubjectGrades(String subjectGrades) {
        SubjectGrades = subjectGrades;
        this.grades = new HashMap<>();
    }

    public void addGrade(String studentName, Integer grade){
        grades.put(studentName, grade);
    }

    public double calculateAverage(){
        if(grades.isEmpty()){
            return 0;
        }
        int tot = 0;
        for(Integer gred:grades.values()){
            tot+=gred;
        }
        double res = (double) tot /grades.size();
        return res;
    }


}
