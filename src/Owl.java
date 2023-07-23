public class Owl extends Animal implements Flyable {
    public void sound() {
        System.out.println("hoots");
    }

    public void fly() {
        System.out.println("Owl can fly");
    }

    public void glide() {
        System.out.println("Owl can glide");
    }
}
