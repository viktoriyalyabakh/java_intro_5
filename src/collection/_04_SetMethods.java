package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _04_SetMethods {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Foo");
        set.add("Bar");
        set.add("bar");
        set.add("abc");
        set.add("foo");
        set.add("xxx");

        System.out.println(set);
        System.out.println(set.size());//6
        System.out.println(set.isEmpty());//false
        System.out.println(set.contains("Foo"));//true
        System.out.println(set.remove("AAA"));//false
        System.out.println(set.remove("Foo"));//true
        System.out.println(set);
        System.out.println(set.equals(set));//true
        set.removeIf(e -> e.toLowerCase().startsWith("b"));
        System.out.println(set);

        set.forEach(System.out::println);

        Iterator<String> it = set.iterator();
        while(it.hasNext()) System.out.println(it.next());
    }
}
