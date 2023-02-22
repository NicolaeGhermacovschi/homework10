public class Elefant extends Erbivor implements  Animal{


    @Override
    public void wolk() {
        System.out.println("Animal wolk");
    }

    @Override
    public void run() {
        System.out.println("Animal runn");
    }

    @Override
    public String eat() {

        return Animal.super.eat();
    }


    @Override
    public void eatPlants() {
        System.out.println("eats plants");
    }
}
