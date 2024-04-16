public class Zoo {
    protected Aquatic[] AquaticAnimals;
    protected int aquaticCount;
    private static final int NBR_CAGES = 25;
    private int nbrCagesOccupied;
     private Aquatic[] aquaticAnimals; // Tableau d'animaux aquatiques
    private int aquaticCount; // Nombre d'animaux aquatiques actuellement dans le zoo


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
         public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;

        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimals[i];
                float depth = penguin.getSwimmingDepth();

                if (depth > maxDepth) {
                    maxDepth = depth;
                }
            }
        }

        return maxDepth;
    }

    // Méthode pour afficher le nombre de dauphins et de pingouins dans le zoo
    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                dolphinCount++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                penguinCount++;
            }
        }

        System.out.println("Number of dolphins in the zoo: " + dolphinCount);
        System.out.println("Number of penguins in the zoo: " + penguinCount);
    }
}
}

    }
