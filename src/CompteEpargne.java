public class CompteEpargne extends Compte{
    private double interet;

    public CompteEpargne(Personne proprietaire, double solde, double interet){
        super(proprietaire,solde);
        this.interet = interet;
    }

    @Override
    public String toString() {
        String resultat = super.toString();
        resultat += "\nPropriétaire du compte épargne : " + this.getProprietaire() ;
        resultat += "\nSolde du compte : " + this.getSolde() ;
        resultat += "\nIntéret du compte : " + interet ;
        return resultat;
    }
}

