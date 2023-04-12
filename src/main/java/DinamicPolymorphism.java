import java.util.Scanner;
public class DinamicPolymorphism {

    public static void main(String[] args) {

        //Dynamic Polymorphism

        Scanner scanner = new Scanner(System.in);
        AnimalB animalB;

        System.out.println("What animal do you want?");
        System.out.print("(1=dog) or (2=cat): ");
        int choice = scanner.nextInt();

        if(choice==1) {
            animalB = new DogB();
            animalB.speak();
        }
        else if(choice==2) {
            animalB = new CatB();
            animalB.speak();
        }
        else {
            animalB = new AnimalB();
            System.out.println("That choice was invalid");
            animalB.speak();
        }
    }
}
//***********************************************
class AnimalB {

    public void speak() {
        System.out.println("animal goes *brrrr*");
    }
}
//***********************************************
class DogB extends AnimalB{

    @Override
    public void speak() {
        System.out.println("dog goes *bark*");
    }
}
//***********************************************
class CatB extends AnimalB{

    @Override
    public void speak() {
        System.out.println("cat goes *meow*");
    }
}
