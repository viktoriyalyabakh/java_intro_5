package string_methods;

public class _15_toCharArray_Method {
    public static void main(String[] args) {

        String word = "Java"; // [J, a, v, a]

        int countA = 0;

        for(char element : word.toCharArray()){
            if(element == 'a') countA++;
        }

        System.out.println(countA);

        String sentence = "I love array";
        int countWord = 1;
        for(char c : sentence.toCharArray()){
            if(c == ' ') countWord++;

        }
        System.out.println(countWord);
    }
}
