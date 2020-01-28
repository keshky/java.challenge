package keshky.hackerrank.problem.solving.challenge;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result2 {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        for (int i = 0; i < grades.size(); i++) {
            Integer grade = grades.get(i);
            int num = grade <10 ? 0 : Character.getNumericValue((grade.toString().charAt(1)));
            if(grade <=10)
                continue;
            else
                if(num == 4 || num == 3) {
                    int tens = Character.getNumericValue(grade.toString().charAt(0));
                    int units = 5;
                    Integer temp = Integer.parseInt(tens + "" + units);
                    if(grade >37)
                        grades.set(i, temp);
                }else if(num == 9 || num == 8) {
                    int tens = Character.getNumericValue(grade.toString().charAt(0)) + 1;
                    int units = 0;
                    Integer temp = Integer.parseInt(tens + "" + units);
                    if(grade >37)
                        grades.set(i, temp);
                }            
        }
        return grades;
    }

}

public class GradingStudents {
    public static void main(String[] args) throws IOException {
    	List<Integer> grd = new ArrayList<>();
    	grd.add(100);
    	grd.add(99);
    	grd.add(20);
    	grd.add(15);
    	grd.add(0);
    	grd.add(91);
    	System.out.println(Result2.gradingStudents(grd));
    	System.exit(1);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result2.gradingStudents(grades);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }

}
