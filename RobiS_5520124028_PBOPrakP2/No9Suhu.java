

package PrakP2;


public class No9Suhu {
    public static void main(String[] args) {
        
        double C = 10, F = 15, R = 5;

        // Celcius ke Fahrenheit dan sebaliknya
        double cToF = (C * 9/5) + 32;
        double fToC = (F - 32) * 5/9;

        // Celcius ke Reamur dan sebaliknya
        double cToR = C * 4/5;
        double rToC = R * 5/4;

        // Fahrenheit ke Reamur dan sebaliknya
        double fToR = (F - 32) * 4/9;
        double rToF = (R * 9/4) + 32;

        System.out.println( C + " Celcius = "  + cToF + " Fahrenheit ");
        System.out.println(F + " Fahrenheit = " + fToC + " Celcius  "  );

        System.out.println(C + " Celcius =  "  + cToR + " Reamur " );
        System.out.println(R + " Reamur = " + rToC  + " Celcius");
        
        System.out.println(F+ " Fahrenheit = "+ fToR + " Reamur");
        System.out.println(R+ " Reamur = " + rToF + " Fahrenheit ");
    }
}

        