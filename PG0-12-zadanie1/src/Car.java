 class Car implements Comparable<Car> {
    private String model;
    private int yearOfProduction;

     public Car(String model, int yearOfProduction) {
         this.model = model;
         this.yearOfProduction = yearOfProduction;
     }

     public String getModel() {
         return model;
     }

     public void setModel(String model) {
         this.model = model;
     }

     public int getYearOfProduction() {
         return yearOfProduction;
     }

     public void setYearOfProduction(int yearOfProduction) {
         this.yearOfProduction = yearOfProduction;
     }

     @Override
     public int compareTo(Car o) {
         return Integer.compare(this.yearOfProduction,o.yearOfProduction);
     }

     @Override
     public String toString() {
         return "Model: " + getModel() + ", " + "Year: " + getYearOfProduction();
     }
 }
