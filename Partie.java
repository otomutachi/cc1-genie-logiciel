public class Partie {
    private Quiz quiz;
    private Joueur joueur;
    private int score;

    public Partie(Quiz quiz, Joueur joueur, int score) {
        this.quiz = quiz;
        this.joueur = joueur;
        this.score = score;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    public Joueur getJoueur() {
        return joueur;
    }

    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return joueur + " a joué " + quiz + " et obtenu " + score + " points";
    }
}