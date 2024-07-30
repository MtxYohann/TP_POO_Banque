public class Personne {
    private String nom, prenom;
    private etatCivil civilStatus;

    public enum etatCivil {
        Célibataire, Marié, Veuve
    }

    public Personne(String nom,String prenom,etatCivil civilStatus){
        this.nom = nom;
        this.prenom = prenom;
        this.civilStatus = civilStatus;
    }

    @Override
    public String toString() {
        String resultat = super.toString();
        resultat += "\nNom : " + nom ;
        resultat += "\nPrénom : " + prenom ;
        resultat += "\nétat civil : "+ civilStatus;
        return resultat;
    }
}
