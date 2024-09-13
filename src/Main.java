import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);
        System.out.println("Emter a 4 digit year");
        int year = myScan.nextInt();

            System.out.println(year / 1000);
            year = year % 1000;
            System.out.println(year / 100);
            year = year % 100;
            System.out.println(year / 10);
            year = year % 10;
            System.out.println(year);

        /* using MATHEMATICAL operations (no Strings), split a year
        Example: if the user enters 1989, the output would be:
        1
        9
        8
        9

         */
    }
}
//Comment on how you tested the code to make sure it works in all situations
//include tests that you ran
/*
test 1: 1989
test 2: 2024
test 3: 0000
test 4
 */