package td5_java;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Vêtement extends ProduitGC implements Promotion {
    private static final double TVA = 0.30;
    private int qte_acheté;
    private String couleur;
    private String taille;

    public Vêtement(long ref, String lib, float p, int q,String Couleur , String taille) {
    	super(ref, lib, p, q);
    	this.couleur=Couleur;
    	this.taille=taille;
    	
    }

   
	@Override
    public String toString() {
        return super.toString() + " Vêtement [couleur=" + couleur + ", taille=" + taille + "]";
    }

    @Override
    void decrire() {
        System.out.println(toString());
    }

    @Override
    public double prixDeVente(String dateStr) {
    	 if (estPeriodePromo(dateStr)) {
             return super.calculPrixTTC()* 0.3;
             }else{
             return super.calculPrixTTC();
         }
     }
    @Override
    public double calculPrixTTC() {
        return this.prixHT * (1 + TVA);
    }
}
