import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class DepartementHashSet implements IDépartement<Departement> {
    private HashSet<Departement> departements;

    public DepartementHashSet() {
        departements = new HashSet<>();
    }

    public void ajouterDepartement(Departement departement) {
        departements.add(departement);
    }
    public boolean rechercherDepartement(String nom) {
        for (Departement departement : departements) {
            if (departement.getNomDepartement().equals(nom)) {
                return true;
            }
        }
        return false;
    }
    public boolean rechercherDepartement(Departement departement) {
        return departements.contains(departement);
    }
    public void supprimerDepartement(Departement departement) {
        departements.remove(departement);
    }
    public void displayDepartement() {
        for (Departement departement : departements) {
            System.out.println(departement);
        }
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> sortedSet = new TreeSet<>(departements);
        return sortedSet;
    }
}