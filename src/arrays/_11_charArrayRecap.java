package arrays;

import java.util.Arrays;

public class _11_charArrayRecap {
    public static void main(String[] args) {

        char[] character = new char[4];

        character[0] = 'V';
        character[1] = 'i';
        character[2] = 'k';
        character[3] = 'a';

        char[] chars = {'V', 'i', 'k', 'a'};

        System.out.println(Arrays.toString(character));
        System.out.println(Arrays.toString(chars));

        character[0] ='v';
        character[1] = character[3];
        System.out.println(Arrays.toString(character));


        for(char c : chars){
            System.out.print(c);
        }

    }

}
