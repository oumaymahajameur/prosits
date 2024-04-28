public class Penguin extends Aquatiques {
    protected float SwimingDepyh;
    class Pingouin extends AnimalAquatique {
    private float profondeurNage; // Profondeur à laquelle le pingouin peut nager

    // Constructeur par défaut
    public Pingouin() {
    }

    // Constructeur paramétré
    public Pingouin(String habitat, float profondeurNage) {
        super(habitat);
        this.profondeurNage = profondeurNage;
    }
}
