public class Bird extends Animal implements Hairy, FlyingCreature {

    @Override
    public void eat() {
        System.out.println("Peck Peck");
    }

    @Override
    public void fly() {
        System.out.println("flap");
    }

    @Override
    public void preen() {
        System.out.println("peck");
    }
}
