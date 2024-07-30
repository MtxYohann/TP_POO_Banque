public class CompteCourant extends Compte {
    private double decouvert;

    public CompteCourant(Personne proprietaire, double solde, double decouvert){
        super(proprietaire,solde);
        this.decouvert = decouvert;
    }

    @Override
    boolean retirer (double montant){
        if(this.getSolde() - montant > 0 - decouvert){
            this.setSolde(this.getSolde() - montant);
            System.out.println("Après retrait votre solde est de : " + this.getSolde());
            return true;
        }
        System.out.println("Retrait impossible, solde insuffisant.");
        return false;
    }

    @Override
    public String toString() {
        String resultat = super.toString();
        resultat += "\nPropriétaire du compte courant : " + this.getProprietaire() ;
        resultat += "\nSolde du compte : " + this.getSolde() ;
        resultat += "\nDécouvert possible du compte : " + decouvert ;
        return resultat;
    }
}


