public class Main {
    public static void main(String[] args) {
        Ironman h1 = new Ironman();
        h1.setName("Ironman");
        h1.setAge("40");
        h1.displayHero();
        h1.skill("shooting");

        Thor h2 = new Thor();
        h2.setName("Thor");
        h2.setAge("1200");
        h2.displayHero();
        h2.weapon("Hummer");
    }
}
