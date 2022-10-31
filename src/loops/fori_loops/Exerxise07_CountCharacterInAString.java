package loops.fori_loops;

public class Exerxise07_CountCharacterInAString {
    public static void main(String[] args) {

        String str = "TechGlobal Schoo";

        int counter = 0;

        for (int i = 0; i < str.length() ; i++) {
            if(str.toLowerCase().charAt(i) == 'o')
                counter ++;
        }
        System.out.println(counter);
    }
}
