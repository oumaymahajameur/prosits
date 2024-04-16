public class Aquatiques {
    protected String habitat;
class AnimalAquatique extends Animal {
    private String habitat; // Habitat de l'animal aquatique

    // Constructeur par défaut
    public AnimalAquatique() {
    }

    // Constructeur paramétré
    public AnimalAquatique(String habitat) {
        this.habitat = habitat;
    }
  public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
}



}
