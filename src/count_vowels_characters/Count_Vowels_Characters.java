package count_vowels_characters;

import java.util.Scanner;

public class Count_Vowels_Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input String");
        String str = sc.nextLine();
        if(str.isEmpty()||str.length()==0){
            System.out.println("String is empty or String length is zer0");
            System.exit(0);
        }
        String strl = str.toLowerCase();
        int vCount=0;
        int cCount=0;
        for(int i=0;i<strl.length();i++)
        {

            if(strl.charAt(i) =='a'||strl.charAt(i) =='e'||strl.charAt(i) =='i'||strl.charAt(i) =='o'||strl.charAt(i)=='u')
            {
              vCount++;
            }
            else if(strl.charAt(i)>='a' &&strl.charAt(i)<='z')
            {
                cCount++;
            }

        }
        System.out.println("Vowel Character Count "+vCount);
        System.out.println("Constants Character Count "+cCount);

    }
}
