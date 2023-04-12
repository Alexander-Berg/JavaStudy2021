public class CopyObjects {

    public static void main(String[] args) {


        CarD carD1 = new CarD("Chevrolet","Camaro",2021);
        //Card car2 = new Card("Ford","Mustang",2022);
        //car2.copy(car1);
        CarD carD2 = new CarD(carD1);

        System.out.println(carD1);
        System.out.println(carD2);
        System.out.println();
        System.out.println(carD1.getMake());
        System.out.println(carD1.getModel());
        System.out.println(carD1.getYear());
        System.out.println();
        System.out.println(carD2.getMake());
        System.out.println(carD2.getModel());
        System.out.println(carD2.getYear());

    }
}
//*********************************************
class CarD {


    private String make;
    private String model;
    private int year;

    CarD(String make,String model,int year){
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    CarD(CarD x){
        this.copy(x);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void copy(CarD x) {
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }

}
