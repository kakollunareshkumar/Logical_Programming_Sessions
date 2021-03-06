package remove_all_whitespaces_from_string_p8;

import java.util.Scanner;

public class Remove_All_White_Space_From_String_M2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter input string to remove white spaces");

        String str = sc.nextLine();
        //Converting String in to char array using toCharArray method
        char[] charArray = str.toCharArray();

        String stringWithoutSpaces = "";

        for (int i = 0; i < charArray.length; i++)
        {
            //if input character  is not a space and a tab then join the character at specific position to string
            if ( (charArray[i] != ' ') && (charArray[i] != '\t') )
            {
                stringWithoutSpaces = stringWithoutSpaces + charArray[i];
            }
        }

        System.out.println("Input String : "+str);

        System.out.println("Input String Without Spaces : "+stringWithoutSpaces);

        sc.close();

    }
}