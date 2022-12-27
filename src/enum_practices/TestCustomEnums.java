package enum_practices;

import java.time.Month;

public class TestCustomEnums {
    public static void main(String[] args) {

        System.out.println(Days.MONDAY);
        System.out.println(Days.TUESDAY);

        Days[] days = Days.values();
        for (Days d : days) {
            System.out.println(d);
        }
        Month[] months = Month.values();
        for (Month m : months) {
            System.out.println(m);
        }
    }
}
