package lv.rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ){
        String[] words = {"sebastian", "lucas", "hanna", "garbiel"};
        String[] years = {"2017", "2017", "2017", "2014", "2009"};

        int sum = 0;
        for (String year : years) {
            sum += Integer.parseInt(year);
        }
        int averageYear = (int) sum / years.length;

        String longestWord = "";
        int maxLength = 0;

        for (String word : words) {
            if (word.length() > maxLength) {
                longestWord = word;
                maxLength = word.length();

            }
        }
        System.out.println("The longest name: " + longestWord);
        System.out.println("Average of the birth years: " + averageYear);
    }


}



