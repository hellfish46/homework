package com.hillel.lecture_3;

/**
 * Created by alpa on 10/22/19
 */
public class MagnitudeChecker {

    public String getGreatestNumberByMagnitude(double a, double b) {
//        TODO implements result

        String result = "";
        double moduleA = Math.abs(a);
        double moduleB = Math.abs(b);
        if (moduleA > moduleB){
            result = "The number " + a + " has the greatest magnitude!";
        } else if (moduleA < moduleB) {
            result = "The number " + b + " has the greatest magnitude!";
        } else if (moduleA == moduleB){
            result = "The number " + a + " and " + b + " are equals by magnitude!";
        }


        return result;
    }
}
