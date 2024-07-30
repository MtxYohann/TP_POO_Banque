public abstract class Compte {
    private Personne proprietaire;
    private final long numero;

    private double solde;
    private static long compteur =0;

    public Compte (Personne proprietaire, double solde){
        this.proprietaire = proprietaire;
        this.numero = ++compteur;
        this.solde = solde;
    }

    public Personne getProprietaire() {
        return proprietaire;
    }

    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }
    boolean retirer(double montant){
        if(solde - montant > 0){
            solde -= montant;
            return true;
        }
        return false;
    }
    void crediter(double montant){
        solde += montant;
    }
    void virement(Compte destination, double montant){
        if(retirer(montant)) {
            destination.crediter(montant);
            System.out.println("Virement effectué, solde actuel : " + this.solde);
            System.out.println("Virement reçu, solde actuel : " + destination.solde);
        }
    }
}
