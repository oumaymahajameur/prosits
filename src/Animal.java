public class Animal {
    protected String habitat;
}
public class Main {
    public static void main(String[] args) {
        AnimalAquatique animalAquatique = new AnimalAquatique("Océan");
        Dauphin dauphin = new Dauphin("Océan", 0.0f);
        Pingouin pingouin = new Pingouin("Antarctique", 0.0f);
        AnimalTerrestre animalTerrestre = new AnimalTerrestre(0);
    }
}