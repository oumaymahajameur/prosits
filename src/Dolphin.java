public class Dolphin extends Aquatiques{
    protected float swimmingSpeed;
    class Dauphin extends AnimalAquatique {
    private float vitesseNage;

    // Constructeur par défaut
    public Dauphin() {
    }

    // Constructeur paramétré
    public Dauphin(String habitat, float vitesseNage) {
        super(habitat);
        this.vitesseNage = vitesseNage;
    }
     public void swim() {
        System.out.println("This dolphin is swimming.");
    }
}-
}
