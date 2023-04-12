public class Polymorphism {

    public static void main(String[] args) {

        // polymorphism = 	greek word for poly-"many", morph-"form"
        //					The ability of an object to identify as more than one type

        CarE carE = new CarE();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        VehicleB[] racers = {carE,bicycle,boat};

        for(VehicleB x : racers) {
            x.go();
        }

    }
}
//**************************************
class VehicleB {

    public void go() {
        // TODO Auto-generated method stub

    }
}
//**************************************
class CarE extends VehicleB{


    @Override
    public void go() {
        System.out.println("*The car begins moving*");
    }
}
//**************************************
class Bicycle extends VehicleB{


    @Override
    public void go() {
        System.out.println("*The bicycle begins moving*");
    }
}
//**************************************
class Boat extends VehicleB{


    @Override
    public void go() {
        System.out.println("*The boat begins moving*");
    }
}