package conditional_statements.ternary_operators;

public class UnderstandingTernary {
    public static void main(String[] args) {
        /*
        F -> female
        M -> male
         */

        char gender = ' ';

        String name = gender == 'F' || gender == 'f'? "Jane" : "John";
    }
}
