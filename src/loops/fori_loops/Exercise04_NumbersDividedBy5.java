package loops.fori_loops;

public class Exercise04_NumbersDividedBy5 {
    public static void main(String[] args) {

        for (int i = 1; i < 51; i++) {
            if (i % 5 == 0)
                System.out.println(i);
        }
    }
}