package exception_handling.try_catch;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class MultipleCatch_Practice {
    public static void main(String[] args) {

        String name = null;
        int age = 25;

        try {
            System.out.println(name.charAt(0));
            System.out.println(age / 0);

        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
        catch(ArithmeticException a){
            a.printStackTrace();
        }

        System.out.println(name + "`s" + " age is " + age + ".");
    }



}
