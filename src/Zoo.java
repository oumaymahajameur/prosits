public class Zoo {
    protected Aquatic[] AquaticAnimals;
    protected int aquaticCount;
    private static final int NBR_CAGES = 25;
    private int nbrCagesOccupied;

    public Zoo() {
        AquaticAnimals = new Aquatic[10];
         nbrCagesOccupied = 0;
    }
        aquaticCount = 0;

    }

    public void AddAquaticAnimal('Aquatic aquatic'){
        if (aquaticCount < 10) {
            AquaticAnimals[aquaticCount] = aquatic;
            aquaticCount++;
            System.out.println("Animal aquatique ajouté au zoo.");
        } else {
            System.out.println("Le zoo ne peut pas accueillir plus d'animaux aquatiques.");
        }
    }
