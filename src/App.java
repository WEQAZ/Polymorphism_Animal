public class App {
    public static void main(String[] args) throws Exception {
        // Add donald as Duck
        Duck donald = new Duck();
        donald.clean(new Cow());

        // Add daisy as PekingDuck
        PekingDuck daisy = new PekingDuck();
        daisy.clean(donald);
    }
}
