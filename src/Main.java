public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Aquatiques aquatiques = new Aquatiques();
        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();

         animal.habitat = "Forêt";
        aquatiques.habitat = "Océan";
        dolphin.habitat = "Océan";
        dolphin.swimmingSpeed = 25.5f;
        penguin.habitat = "Océan";
        penguin.SwimingDepyh = 10.2f;

        // Affichage des attributs des instances
        System.out.println("Animal habitat: " + animal.habitat);
        System.out.println("AquaticAnimal habitat: " + aquatiques.habitat);
        System.out.println("Dolphin habitat: " + dolphin.habitat);
        System.out.println("Dolphin swimming speed: " + dolphin.swimmingSpeed);
        System.out.println("Penguin habitat: " + penguin.habitat);
        System.out.println("Penguin swimming depth: " + penguin.SwimingDepyh);
    }
}
