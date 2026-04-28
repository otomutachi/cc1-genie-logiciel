public class Quiz {
    private String nom;
    private Categorie categorie;
    private Auteur auteur;
    private Question[] questions;

    public Quiz(String nom, Categorie categorie, Auteur auteur, Question[] questions) {
        this.nom = nom;
        this.categorie = categorie;
        this.auteur = auteur;
        this.questions = questions;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    public Question[] getQuestions() {
        return questions;
    }

    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return nom + " (" + categorie + ") par " + auteur;
    }
}