public class Joueur {
    private String nom;
    private String prenom;

    public Joueur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    //setters et getters
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return prenom + " " + nom;
    }
}
