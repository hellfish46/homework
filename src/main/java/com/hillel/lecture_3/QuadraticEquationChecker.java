package com.hillel.lecture_3;

/**
 * Created by alpa on 10/22/19
 */
/**
 * Написать программу, которая бы решала квадратное уравнение вида a x2+b x+c = 0
 * Переменный a, b, c можно задать вручную. Программа должна учитывать варианты:
 * 1) когда a=0
 * 2) когда дискриминант < 0 - решений нет
 * 3) когда дискриминант = 0 - тогда х1 == х2
 * 4) когда дискриминант > 0 - тогда в уравнении два корня
 */
public class QuadraticEquationChecker {


    public String checkQuadraticEquation(double a, double b, double c) {
//        TODO implements result
        String result = "";

        double di = b*b - 4*a*c;


        if (a == 0) {
            result = "The 'a' coefficient should not be zero!";
            return result;
        } else if (di < 0){
            result = "No roots on the set of real numbers!";
            return result;
        } else if (di > 0){
            double xOne = (-b + Math.sqrt(di)) / 2 * a;
            double xTwo = (-b - Math.sqrt(di)) / 2 * a;
            result = "Discriminant: " + di + ", x1: " + xOne + ", x2: " + xTwo; // Discriminant: 17.0, x1: -0.4384471871911697, x2: -4.561552812808831
            return result;
        } else if (di == 0){
            double xOne = (-b + Math.sqrt(di)) / 2 * a;
            result = "Two real, identical roots: [x1 && x2] = " + xOne;
            return result;
        }



       return result;
    }

}
