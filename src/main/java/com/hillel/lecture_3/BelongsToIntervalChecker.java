package com.hillel.lecture_3;

/**
 * Created by alpa on 10/22/19
 */
public class BelongsToIntervalChecker {

    public String checkNumberInInterval(int from, int to, int number) {
        if (number>= -5 && number <= 3) {
            String result = "Number " + number + " belong to interval [-5;3]" ;
            return result;
        } else {
            String result = "Number " + number + " not belong to interval [-5;3]" ;
            return result;
        }

    }
}
