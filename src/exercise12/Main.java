package exercise12;
import java.time.LocalTime;
public class Main {
    public static void main(String[] args) {
        Airplane flight1 = new Airplane("MAE342W", "United Status", LocalTime.of(1, 19));
        Airplane flight2 = new Airplane("SAE342W", "NewYork", LocalTime.of(11, 29));
        Airplane flight3 = new Airplane("MASA132", "Saudi Arabia", LocalTime.of(12, 20));
        System.out.println("Flight Status");

        flight1.checkStatus();
        flight2.checkStatus();
        flight3.checkStatus();
        flight1.delay(40);
        flight2.delay(34);
        System.out.println("\nCurrent Flight Status:");
        System.out.println("Flight Status");

        flight1.checkStatus();
        flight2.checkStatus();
        flight3.checkStatus();
    }
    }
