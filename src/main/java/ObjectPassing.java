public class ObjectPassing {

    public static void main(String[] args) {

        Garage garage = new Garage();

        CarX carX1 = new CarX("BMW");
        CarX carX2= new CarX("Tesla");

        garage.park(carX1);
        garage.park(carX2);

    }
}
//********************************************
class Garage {


    void park(CarX car) {
        System.out.println("The "+car.name+" is parked in the garage");
    }
}//********************************************
 class CarX {


    String name;

    CarX(String name) {
        this.name = name;
    }
}