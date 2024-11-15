package lv.rvt;

import java.util.Scanner;

public class MainProgram {
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);

        Statistic statistics = new Statistic();
        Statistic statistic2 = new Statistic();
        System.out.println("Enter numbers: ");
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            if(number == -1){
                break;
            }
            statistic2.addNumber(number);
        }

        System.out.println();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.suma());
        System.out.println("Average: " + statistics.average());
        System.out.println();
        System.out.println("Sum: " + statistic2.suma());
        System.out.println("Sum of even numbers: " + statistic2.even());
        System.out.println("Sum of odd numbers: " + statistic2.odd());
    }
}
