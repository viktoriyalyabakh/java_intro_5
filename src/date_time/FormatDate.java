package date_time;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import utilities.ScannerHelper;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class FormatDate {
    public static void main(String[] args) {

        System.out.println("\n-------Formatting Date--------\n");
        Date date = new Date();
        System.out.println(date); // Sun Dec 11 11:34:19 CST 2022 - EEE MMM dd hh:mm:ss z yyyy

//Print the date in the format of MM/dd/yyyy 12/11/2022
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(formatter.format(date)); // 12/11/2022


//Print the date in the format of yyyy 2022
        System.out.println(new SimpleDateFormat("yyyy").format(new Date())); // 2022
        System.out.println(new SimpleDateFormat("hh 'o''clock' a, zzzz").format(new Date())); //11 o'clock AM, Central Standard Time

        int age = ScannerHelper.getAnAge();
        System.out.println(LocalDate.now().getYear() - age);
        System.out.println(LocalDate.now().minusYears(age).getYear());
        System.out.println(LocalDate.now().minus(age, ChronoUnit.YEARS).getYear());




    }




}
