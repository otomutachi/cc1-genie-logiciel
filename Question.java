public class Question {
    private String titre;
    private Reponse[] reponses;

    public Question(String titre, Reponse[] reponses) {
        this.titre = titre;
        this.reponses = reponses;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Reponse[] getReponses() {
        return reponses;
    }

    public void setReponses(Reponse[] reponses) {
        this.reponses = reponses;
    }

    @Override
    public String toString() {
        return titre;
    }
}