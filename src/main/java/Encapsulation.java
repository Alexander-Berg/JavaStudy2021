public class Encapsulation {

    public static void main(String[] args) {

        // Encapsulation = 	attributes of a class will be hidden or private,
        //					Can be accessed only through methods (getters & setters)
        //					You should make attributes private if you don't have a reason to make them public/protected

        CarC carC = new CarC("Chevrolet","Camaro",2021);

        carC.setYear(2022);

        System.out.println(carC.getMake());
        System.out.println(carC.getModel());
        System.out.println(carC.getYear());

    }

}
//***********************************************
class CarC {


    private String make;
    private String model;
    private int year;

    CarC(String make,String model,int year){
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
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

}