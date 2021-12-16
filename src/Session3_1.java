public class Session3_1 {
    public static void main(String[] args) {
        Car pride = new Car();
//        pride.color = "White";
        pride.brand = "SIAPA";
//        car.velocity = 100;
        pride.move();
        pride.breaks();

        Car.numberOfProducedCar++;
        Car BMW = new Car();
//        car1.velocity = 200;
        BMW.brand = "BMW";
//        BMW.color = "Red";
        BMW.move();
        BMW.breaks();

        Car benz = new Car();
//        benz.color = "Blue";
        benz.brand = "Benz";
        benz.move();
        Car.printNumberOfProducedCars();
    }
}
