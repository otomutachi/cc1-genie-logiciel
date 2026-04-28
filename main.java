public class Main {
    public static void main(String[] args) {
        Auteur redacteur = new Auteur("Bardella", "Jordan");

        Reponse[] reponses = {
            new Reponse("Paris", true, Position.A),
            new Reponse("Barcelone", false, Position.B),
            new Reponse("Valence", false, Position.C),
            new Reponse("Séville", false, Position.D)
        };

        Question question = new Question("dans quelle ville a etait crée assasin creed unity ?", reponses);
        Question[] questions = {question};
        Quiz quiz = new Quiz("Géographie", Categorie.GEOGRAPHIE, redacteur, questions);

        Joueur joueur1 = new Joueur("auditore", "ezio");
        Joueur joueur2 = new Joueur("valhalla", "evor");

        Partie partie1 = new Partie(quiz, joueur1, 1);
        Partie partie2 = new Partie(quiz, joueur2, 0);

        System.out.println("Quiz : " + quiz);
        System.out.println("Question : " + question.getTitre());
        System.out.println("Partie 1 : " + partie1);
        System.out.println("Partie 2 : " + partie2);
    }
}
