public class Duck extends Animal implements Flyable {
    
    public void sound() {
        System.out.println("quack");
    }

    public void fly() {
        System.out.println("Duck can fly");
    }

    public void glide() {
        System.out.println("Duck can glide");
    }

    public void clean(Animal ani){
        System.out.println(this.getClass()+" is cleaning " + ani);
    }
}
