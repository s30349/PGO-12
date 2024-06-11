import java.util.*;

public class Main {
    public static void main(String[] args) {

        //zadanie.1
        ArrayList<Car>cars=new ArrayList<>();
        cars.add(new Car("Honda",2012));
        cars.add(new Car("Mercedes",2013));
        cars.add(new Car("Lexus",2014));
        cars.add(new Car("Ford",2015));
        cars.add(new Car("Infiniti",2009));
        cars.add(new Car("Volvo",2024));
        cars.add(new Car("BMW",2010));
        cars.add(new Car("Audi",2019));
        cars.add(new Car("Toyota",2020));
        cars.add(new Car("Chevrolet",2021));

        Collections.sort(cars);

        for (Car car : cars){
            System.out.println(car);
        }

    }
}