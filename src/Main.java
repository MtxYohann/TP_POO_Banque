public class Main {
    public static void main(String[] args) {
        Personne personne = new Personne("Mathieux","Yohann", Personne.etatCivil.Célibataire);
        CompteCourant compteCourant = new CompteCourant(personne,1000,200);
        CompteEpargne compteEpargne = new CompteEpargne(personne,1000,0.02);

        System.out.println(compteCourant.toString());
        System.out.println();
        System.out.println(compteEpargne.toString());
        System.out.println();
        compteCourant.retirer(100);
        System.out.println();
        compteCourant.virement(compteEpargne,10);
        System.out.println();
        compteEpargne.virement(compteCourant,500);
    }
}