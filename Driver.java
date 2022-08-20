import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main(String args[]) {
        SportsCar sc = new SportsCar();
        Car c = sc;

        sc.speed(100);
        c.speed(45);

        // This will add the cars to my List
        List<Car> cars = new ArrayList<>();
        cars.add(new SportsCar());
        cars.add(new Car());

        for (Car gas : cars) {
            gas.gasType();
        }
    }
}