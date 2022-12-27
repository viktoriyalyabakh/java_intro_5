package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _02_set {
    public static void main(String[] args) {

        HashSet<Integer> hashSret = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSret = new LinkedHashSet<>();
        TreeSet<Integer> treeSret = new TreeSet<>();


        System.out.println("\n-----------HasSet-----------\n");
        hashSret.add(5);
        hashSret.add(5);
        hashSret.add(10);
        hashSret.add(0);
        hashSret.add(null);
        hashSret.add(null);

        System.out.println(hashSret);

        System.out.println("\n-----------LinkedHasSet-----------\n");
        linkedHashSret.add(5);
        linkedHashSret.add(5);
        linkedHashSret.add(10);
        linkedHashSret.add(0);
        linkedHashSret.add(null);
        linkedHashSret.add(null);

        System.out.println(linkedHashSret);


        System.out.println("\n-----------TreeSet-----------\n");
        treeSret.add(5);
        treeSret.add(5);
        treeSret.add(10);
        treeSret.add(0);
//        treeSret.add(null);//NullPointerException
//        treeSret.add(null);//NullPointerException

        System.out.println(treeSret);
    }

}
