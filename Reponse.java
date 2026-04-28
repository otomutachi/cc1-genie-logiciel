public class Reponse {
    private String texte;
    private boolean bonneReponse;
    private Position position;

    public Reponse(String texte, boolean bonneReponse, Position position) {
        this.texte = texte;
        this.bonneReponse = bonneReponse;
        this.position = position;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public boolean isBonneReponse() {
        return bonneReponse;
    }

    public void setBonneReponse(boolean bonneReponse) {
        this.bonneReponse = bonneReponse;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return position + ": " + texte + (bonneReponse ? " (correct)" : "");
    }
}