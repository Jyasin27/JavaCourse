package chapter12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HighestResults {

    public static void main(String args[])
    {
        Map<String, Integer> test1 = TestResults.getOriginalGrades();
        Map<String, Integer> test2 = TestResults.getMakeUpGrades();

        for (var student:test2.entrySet())
        {
            Integer firstGrade = test1.get(student.getKey());
            Integer secondGrade = test2.get(student.getKey());

            if(firstGrade > secondGrade)
            {
            test1.put(student.getKey(),secondGrade);

            }
        }









    }

}
