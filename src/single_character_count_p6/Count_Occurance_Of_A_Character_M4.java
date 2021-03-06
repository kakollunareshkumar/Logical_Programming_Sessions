package single_character_count_p6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Count_Occurance_Of_A_Character_M4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input String");
        String str = sc.nextLine();
        System.out.println("Enter character");
        char c = sc.next().charAt(0);
        System.out.println("occurance of character "+ c+" "+countOccurrences(str,c));
    }


    private static int countOccurrences(String str, char ch) {
        //Matcher is a class that uses regexp pattern.compile method to find regular expression
        // in a given string
        Matcher matcher = Pattern.compile(String.valueOf(ch))
                .matcher(str);

        int counter = 0;
        //find the expression that matches the pattern
        while (matcher.find()) {
            counter++;
        }

        return counter;
    }

}
