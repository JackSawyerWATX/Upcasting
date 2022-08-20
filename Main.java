public class Main {

    public static void main(String args[]) {

        
        SportsCar sc = new SportsCar();
        Car c = sc;

        System.out.println(sc.speed(100));
        System.out.println(c.speed(45));
    }

}