import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Car {
    String name;
    String model;
    int year;

    public Car(String name, String model, int year) {
        this.name = name;
        this.model = model;
        this.year = year;
    }

    public void details() {
        System.out.println(name + " : " + model + " : " + year);
    }
}

public class Car_main {
    public static void main(String args[]) throws IOException {
        // Car car1 = new Car("Tata", "City", 2022);
        // car1.details();

        /*
         * Car[] car1 = new Car[3];
         * 
         * car1[0] = new Car("Tata", "city", 2022);
         * car1[1] = new Car("lambhorgini", "hyd", 9845);
         * car1[2] = new Car("Kia", "mpl", 6564);
         * 
         * for (int i = 0; i < car1.length; i++) {
         * car1[i].details();
         * }
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        String model = br.readLine();
        int year = Integer.parseInt(br.readLine());
        Car o = new Car(name, model, year);
        o.details();
    }
}
