package loops.do_while_loops;

public class Exercise02_PrintNumberDividedBy3 {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 100) {
            if (i % 3 == 0) System.out.print(i + " - ");
            i++;
        }
    }
}
