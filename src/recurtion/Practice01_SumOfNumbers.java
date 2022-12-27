package recurtion;

public class Practice01_SumOfNumbers {

    public static int sum(int n){

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int productRecursive(int n){
        if(n == 1) return 1;
        return n * productRecursive(n -1);
    }

    public static void main(String[] args) {
        System.out.println(sum(3));
        System.out.println(productRecursive(4));
    }
}
