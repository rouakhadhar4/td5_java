package td5_java;
import java.time.format.DateTimeFormatter;

class ProduitElec extends Article implements Promotion {
    private static final double TVA = 0.20;
    private String categorie;
    private int qte_acheté;

    public ProduitElec(long ref, String lib, float p, int q, String categorie) {
        super(ref, lib, p, q);
        this.categorie = categorie;
    }

    @Override
    public double calculPrixTTC() {
        return this.prixHT * (1.08 + TVA);
    }

    @Override
    public String toString() {
        return super.toString() + " ProduitElec [categorie=" + categorie + "]";
    }

    @Override
    public double prixDeVente(String dateStr) {
        if (estPeriodePromo(dateStr)) {
            return this.calculPrixTTC() *0.2; 
            } else {
            return calculPrixTTC();
        }
    }
    }




