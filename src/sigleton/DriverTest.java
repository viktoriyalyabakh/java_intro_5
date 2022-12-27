package sigleton;

public class DriverTest {
    public static void main(String[] args) {
        Driver driver1 = Driver.getDriver();
        Driver driver2 = Driver.getDriver();
        Driver driver3 = Driver.getDriver();
        Driver driver4 = Driver.getDriver();

        System.out.println(driver1);
        System.out.println(driver2);
        System.out.println(driver3);
        System.out.println(driver4);
    }


}
