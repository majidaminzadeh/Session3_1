
/*
Access modifier
    public      قابل فراخوانی و دیده شدن از همه جا
    private     فقط در سطح کلاس دیده میشود
    protected   //
    []          default package
 */
/*
    non-Access modifier
    static      ویژگیهای سطح کلاس را تعریف میکند
    final
 */
public class Car {
    static int numberOfProducedCar = 0;
    final String color;
    int velocity = 10;
    String brand;

    public Car(){
        System.out.println("I created!");
        System.out.println(velocity);
        color = "Red";
    }

    void breaks(){
        System.out.println(color + " " + brand + " is going to stop");
    }

    void move(){
        System.out.println("Number of produced car is " + numberOfProducedCar);
        numberOfProducedCar++;
        System.out.println("Speed is " + velocity);
        velocity++;
        System.out.println(color + " " + brand + " is moving");
    }

    static void printNumberOfProducedCars(){
        System.out.println(numberOfProducedCar);
    }
}
