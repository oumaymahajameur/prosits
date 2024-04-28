public class Terrestre {
    protected int nbrlegs;
    class AnimalTerrestre extends Animal {
        private int nbrPattes; // Nombre de pattes de l'animal terrestre

        // Constructeur par défaut
        public AnimalTerrestre() {
        }

        // Constructeur paramétré
        public AnimalTerrestre(int nbrPattes) {
            this.nbrPattes = nbrPattes;
        }
    }

