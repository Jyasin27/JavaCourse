package chapter12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HighestResults {

    public static void main(String args[])
    {
        Map<String, Integer> gradeFinal = TestResults.getOriginalGrades();
        Map<String, Integer> test2 = TestResults.getMakeUpGrades();

        for (var student:test2.entrySet())
        {
            Integer firstGrade = gradeFinal.get(student.getKey());
            Integer secondGrade = test2.get(student.getKey());

            if(firstGrade > secondGrade)
            {
            gradeFinal.put(student.getKey(), firstGrade); //.put - store

            }
            else
            {
                gradeFinal.put(student.getKey(), secondGrade);
            }

        }
       // System.out.println(gradeFinal); {Raja=89, Angie=97, Shashi=79, Amber=95, Rex=95, Bas=98, Lisi=80, Jason=63, Dave=82, Carlos=80, Nikolay=79}
        gradeFinal.forEach(
                (n, g) -> System.out.println("Student: " + n + " " + g)
                );



    }

}
