package td5_java;

public class ProduitGC extends Article {
	 private int qte_acheté;
  
	 public ProduitGC(long ref, String lib, float p, int q) {
			super(ref, lib, p, q);
			
		}


	    
	    @Override
	    public double calculPrixTTC() {
	        double prixTTC = 0;

	       
	        prixTTC = this.prixHT * (1 + TVA);

	        return prixTTC;
	    }
        @Override
	    public String toString() {
	        return super.toString() + " - produit [Type: ProduitGC]";
	    }

	    
	    @Override
	    void decrire() {
	        System.out.println(toString());
	    }
	

		 

	}


