class Car {
    String model;
    double price;

    Car() {
        model = "Not Specified";
        price = 0;
    }
    
    Car(String model) {
        this.model = model;
        price = 0;
    }

    
    Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    void display() {
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
        System.out.println();
    }
}

public class CarDetails {
    public static void main(String[] args) {

        Car c1 = new Car();
        Car c2 = new Car("Hyundai i20");
        Car c3 = new Car("Honda City", 1500000);

        System.out.println("Car 1 Details");
        c1.display();

        System.out.println("Car 2 Details");
        c2.display();

        System.out.println("Car 3 Details");
        c3.display();
    }
}